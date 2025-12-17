package Multithreading.ThreadPool.MyScheduledExService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MySchedule {
    public static void main(String[] args) {
        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(1);
        System.out.println("wait for 2 seconds");
        schedule.schedule(()->{
            System.out.println("hello world");
        },2, TimeUnit.SECONDS);

        schedule.shutdown();
    }
}
