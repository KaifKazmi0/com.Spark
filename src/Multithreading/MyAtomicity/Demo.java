package Multithreading.MyAtomicity;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class Racing{
    private volatile int count = 0;

//    AtomicInteger count = new AtomicInteger(0);

    public void setCount(){
        count++;
//        count.addAndGet(1);
    }

    public int getCount(){
        return count;
//        return count.get();
    }

}


public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Racing r = new Racing();

        ExecutorService executor = Executors.newFixedThreadPool(10);


       for (int i=1;i<=10;i++){
           executor.submit(()->{
               for (int j=1;j<=10000;j++){
                   r.setCount();
               }
           });
       }

       executor.shutdown();
       executor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println(r.getCount());
    }
}
