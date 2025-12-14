package Multithreading.Locks.FairnessOfLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairExample {
    Lock lock = new ReentrantLock();
    public void getMassege(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" acquired lock");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()+" released lock");
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        UnfairExample obj = new UnfairExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                obj.getMassege();
            }
        };

        Thread thread1 = new Thread(task,"thread1");
        Thread thread2 = new Thread(task,"thread2");
        Thread thread3 = new Thread(task,"thread3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
