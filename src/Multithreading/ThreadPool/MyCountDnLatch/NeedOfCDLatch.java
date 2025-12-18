package Multithreading.ThreadPool.MyCountDnLatch;

import java.util.concurrent.*;

public class  NeedOfCDLatch{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
       Future<?> future1 = executor.submit(new dependentService());
        Future<?> future2 =executor.submit(new dependentService());
        Future<?> future3 =executor.submit(new dependentService());


        future1.get();
        future2.get();
        future3.get();

        //if we want below line to run in last , we can use get but if there are n no. of futureN
        //it'll be hectic to do future.get() for each manually , CountDownLatch solves this problem
        System.out.println("hello from -> "+Thread.currentThread().getName());


        executor.shutdown();
    }
}
class dependentService implements Callable<String>{
    @Override
    public String call(){
        try {
            System.out.println("hello from -> "+Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        return "ok";
    }
}