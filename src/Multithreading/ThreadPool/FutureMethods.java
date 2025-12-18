package Multithreading.ThreadPool;

import java.util.concurrent.*;

public class FutureMethods {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<?> future = executor.submit(()->{
            try {
                System.out.println("hello");
                Thread.sleep(2000);
                return "world";
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                return null;
            }
        });
        future.cancel(true);
        try{
            future.get(1000, TimeUnit.MILLISECONDS);
        }catch (TimeoutException | InterruptedException | ExecutionException | CancellationException e){
            System.out.println(e);
        }


        if (future.isDone()){
            System.out.println("success...");
        }
        System.out.println(future.isDone());

        System.out.println(future.isCancelled());


        executor.shutdown();





    }
}
