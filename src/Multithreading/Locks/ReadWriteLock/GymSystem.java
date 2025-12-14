package Multithreading.Locks.ReadWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class GymSystem {

     private int members = 0;

     private final ReadWriteLock lock = new ReentrantReadWriteLock();

     private final Lock readLock = lock.readLock();

     private final Lock writeLock = lock.writeLock();

     public void getMemberCount(){
         readLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" Members in gym: "+members);
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            readLock.unlock();
        }
     }

     public void updateMembers(int val){
         writeLock.lock();
         try{
             System.out.println(Thread.currentThread().getName()+" updated members"+val);
             members+=val;
             Thread.sleep(1000);
         }catch (InterruptedException e){
             Thread.currentThread().interrupt();
         }finally {
             writeLock.unlock();
         }
     }


    public static void main(String[] args) {
        GymSystem machine = new GymSystem();

        Runnable write = new Runnable() {
            @Override
            public void run() {
               machine.updateMembers(5);
            }
        };


        Runnable read = new Runnable() {
            @Override
            public void run() {
                machine.getMemberCount();
            }
        };



        Thread user1 = new Thread(read,"user1");
        Thread user2 = new Thread(read,"user2");
        Thread user3 = new Thread(read,"user3");


        Thread receptionist = new Thread(write,"receptionist");

        Thread user4 = new Thread(read,"user4");
        Thread user5 = new Thread(read,"user5");
        Thread user6 = new Thread(read,"user6");

        user1.start();
        user2.start();
        user3.start();

        receptionist.start();

        user4.start();
        user5.start();
        user6.start();


    }

}
