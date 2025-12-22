package Multithreading.CompetetablerFutre;

import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(1);

        CompletableFuture<String> cf =CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "hello";
        },executor).thenApply(x -> x+" from "+Thread.currentThread().getName());
        System.out.println(cf.join());
        System.out.println("main");
        executor.shutdown();
    }
}
