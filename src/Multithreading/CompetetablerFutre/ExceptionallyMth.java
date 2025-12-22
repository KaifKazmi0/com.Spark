package Multithreading.CompetetablerFutre;

import java.util.concurrent.CompletableFuture;

public class ExceptionallyMth {
    public static void main(String[] args) {
        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (true) throw new RuntimeException("Error");
            return 34;
        }).exceptionally(ex -> 0);


        System.out.println(cf.join());
    }
}
