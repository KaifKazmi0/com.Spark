package Multithreading.ThreadPool.MyScheduledExService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MySAtFixedRate {
    public static void main(String[] args) {
        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(3);


        schedule.scheduleAtFixedRate(()->{
            System.out.print(Thread.currentThread().getName()+"beep1...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },2,5, TimeUnit.SECONDS);


        schedule.scheduleWithFixedDelay(()->{
            System.out.print(Thread.currentThread().getName()+"beep2...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },2,5, TimeUnit.SECONDS);



        schedule.schedule(()->{
            System.out.println(Thread.currentThread().getName()+" Initiating shutdown...");
            schedule.shutdown();
        },20,TimeUnit.SECONDS);
    }
}
