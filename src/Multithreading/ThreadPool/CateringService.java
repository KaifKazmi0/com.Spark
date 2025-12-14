package Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CateringService {

    public static int prepareOrder(int num){
        int x = 1;
        for (int i=1;i<=num;i++){
            num*=i;
        }
        return num;
    }

    public static void main(String[] args) {
        ExecutorService chef = Executors.newFixedThreadPool(2);

        for (int i=1;i<=5;i++){
            final int x=i;
            chef.submit(()->{
                try{
                    System.out.println(Thread.currentThread().getName()+" Preparing order...."+x);
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+" order completed...!: "+prepareOrder(x));
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            });
        }
    }
}

