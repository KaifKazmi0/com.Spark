package Multithreading.CompetetablerFutre;

import java.util.concurrent.CompletableFuture;

public class ComposeMtd {
    public static void main(String[] args) {
        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(()-> 35)
                .thenCompose(x ->CompletableFuture.supplyAsync(()->x+10));

        System.out.println(cf.join());
    }
}
