package Multithreading.ThreadPool.MyCountDnLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class OnManualThread {

    public static void main(String[] args) throws InterruptedException {

        int numOfService = 3;

        CountDownLatch latch = new CountDownLatch(numOfService);

        for (int i = 0; i < numOfService; i++) {
            new Thread(new Depend(latch)).start();
        }

        // Main thread waits only for 5 seconds
        boolean completed = latch.await(5, TimeUnit.SECONDS);

        System.out.println(
                "Latch completed: " + completed +
                        " | hello from " + Thread.currentThread().getName()
        );
    }
}
class Depend implements Runnable {

    private final CountDownLatch latch;

    Depend(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(6000); // longer than await timeout
            System.out.println(
                    "hello from " + Thread.currentThread().getName()
            );
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            latch.countDown(); // ALWAYS decrement
        }
    }
}
