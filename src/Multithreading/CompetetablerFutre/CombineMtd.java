package Multithreading.CompetetablerFutre;

import java.util.concurrent.CompletableFuture;

public class CombineMtd {
    public static void main(String[] args) {
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(()->10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(()->20);

        CompletableFuture<Integer> cf = f1.thenCombine(f2,(x,y)->x+y);

        System.out.println(cf.join());


    }
}
