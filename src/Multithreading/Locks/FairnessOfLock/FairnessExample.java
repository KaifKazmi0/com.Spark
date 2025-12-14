package Multithreading.Locks.FairnessOfLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessExample {
    //the true passed in constructor will  guarantee the fairness but not the order
    //it'll just manage FIFO for threads waiting in queue , maybe thread3 first acquires the lock as they have same priority
    Lock lock = new ReentrantLock(true);

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
        FairnessExample obj = new FairnessExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                obj.getMassege();
            }
        };

        Thread thread1 = new Thread(task,"thread1");
        Thread thread2 = new Thread(task,"thread2");
        Thread thread3 = new Thread(task,"thread3");

       try{
           thread1.start();
           Thread.sleep(10);
           thread2.start();
           Thread.sleep(10);
           thread3.start();
       }catch (InterruptedException e){
           Thread.currentThread().interrupt();
       }

    }
}
