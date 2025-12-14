package Multithreading.ThreadPool;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class TheInvestmentBank {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Integer> company1 = executorService.submit(()->{
            return call(1);
        });
        Future<Integer> company2 = executorService.submit(()->{
            return call(2);
        });
        Future<Integer> company3 = executorService.submit(()->{
            return call(3);
        });
        Future<Integer> company4 = executorService.submit(()->{
            return call(4);
        });
        Future<Integer> company5 = executorService.submit(()->{
            return call(5);
        });


        List<Integer> list = Arrays.asList(company1.get(),company2.get(),company3.get(),company4.get(),company5.get());

        int profit = 0;
        for (Integer l:list){
            profit+=l;
        }

        System.out.println("The profit of the day is :"+profit);


        executorService.shutdown();
    }

    public static int call(int companyId){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return 100*companyId;
    }

}
