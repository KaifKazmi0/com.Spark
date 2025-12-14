package Multithreading.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyFutureKeyword {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();


        //<?> is wildcard , it can take anything
        //Generics can be specific too e.g <Integer>,<String>

        //All these are Callable in submit
        Future<?> future1 = executor.submit(() -> 42);
        Future<?> future2 = executor.submit(() -> "kaif");
        Future<Integer> future3 = executor.submit(() -> 20);
        Future<String> future4 = executor.submit(() -> "kaif");


        Future<?> future5 = executor.submit(() -> System.out.println("kya cheda bsdi"));


        //if we want to return anything we can do using future
        //get method will till the submit finishes its task
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get());

        System.out.println(future5.get());

if(future1.isDone() &&future2.isDone() &&future3.isDone() &&future3.isDone() &&future5.isDone()){
    System.out.println("Process Finished Chad");
}
        executor.shutdown();
    }
}
