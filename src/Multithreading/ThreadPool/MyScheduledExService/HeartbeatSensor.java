package Multithreading.ThreadPool.MyScheduledExService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class HeartbeatSensor {
    public static void main(String[] args)  {
        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(2);

        schedule.scheduleWithFixedDelay(()->{
                    System.out.println("Pulse...");
                }, 0,2,
                TimeUnit.SECONDS);


        schedule.scheduleWithFixedDelay(()->{
                    System.out.println("Oxygen...");
                }, 0,5,
                TimeUnit.SECONDS);


        schedule.schedule(()->{
            schedule.shutdown();
        },15,TimeUnit.SECONDS);

//        try {
//            Thread.sleep(15000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        schedule.shutdown();
    }

}
