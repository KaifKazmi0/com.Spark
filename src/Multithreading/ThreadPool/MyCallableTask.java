package Multithreading.ThreadPool;

import java.util.concurrent.Callable;

public class MyCallableTask implements Callable {
    @Override
    public Object call() throws InterruptedException {//Can use throws
        Thread.sleep(1000);
        return 1;
    }
}
