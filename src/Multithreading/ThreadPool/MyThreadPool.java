package Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyThreadPool {




    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();  //1 jan 1970 mili

//        Thread[] thread = new Thread[10];

        ExecutorService executor = Executors.newFixedThreadPool(4);


        for (int i = 0; i <= 9; i++) {
            final int finalI = i;
            Future<?> future = executor.submit(() -> {
                long result = factorial(finalI);
                System.out.print(result);
                System.out.println(" time: " + (System.currentTimeMillis() - starttime));
            });
        }
        executor.shutdown();
        System.out.println("Total time: " + (System.currentTimeMillis() - starttime));

    }

    static long factorial(int x)  {
        int result =1;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i=0;i<=x;i++){
            result*=i+1;
        }
        return result;
    }
}
