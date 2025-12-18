package Multithreading.ThreadPool.MyCountDnLatch;

import java.util.concurrent.*;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        int numberOfServices = 3;

        ExecutorService executor =
                Executors.newFixedThreadPool(numberOfServices);

        CountDownLatch latch =
                new CountDownLatch(numberOfServices);

        Future<?> future1 =
                executor.submit(new DependentService(latch));

        Future<?> future2 =
                executor.submit(new DependentService(latch));

        Future<?> future3 =
                executor.submit(new DependentService(latch));


        latch.await();

        System.out.println(
                "hello from " + Thread.currentThread().getName()
        );

        executor.shutdown();
    }
}


class DependentService implements Callable<String> {

    private final CountDownLatch latch;

    DependentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {

        System.out.println(
                "hello from " + Thread.currentThread().getName()
        );

        Thread.sleep(2000);

        latch.countDown();

        return "ok";
    }
}
