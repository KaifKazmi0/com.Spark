package Multithreading.Locks.ReadWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteExample {
    int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock writelock = lock.writeLock();

    private final Lock readlock = lock.readLock();


    public void increament(){
        writelock.lock();
        try{
            for (int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+" incremented "+(++count));
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            writelock.unlock();
        }
    }

    public void get(){
        readlock.lock();
        try{
            for (int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+" "+count);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            readlock.unlock();
        }
    }


    public static void main(String[] args) {
        ReadWriteExample obj = new ReadWriteExample();

        Runnable read = new Runnable() {
            @Override
            public void run() {
                obj.get();
            }
        };

        Runnable write = new Runnable() {
            @Override
            public void run() {
                obj.increament();
            }
        };


        Thread thread1 = new Thread(write,"thread1");
        Thread thread2 = new Thread(read,"thread2");
        Thread thread3 = new Thread(read,"thread3");

       try{
           thread1.start();
           Thread.sleep(10);
           thread2.start();
           thread3.start();
       }catch (InterruptedException e){
           Thread.currentThread().interrupt();
       }
    }



}
