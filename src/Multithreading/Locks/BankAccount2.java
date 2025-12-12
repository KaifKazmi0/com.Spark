package Multithreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount2 {
    int bal= 10000;

    Lock lock = new ReentrantLock();

    public void withdraw(int amt){
        System.out.println(Thread.currentThread().getName()+"Attempting to withdraw.....");
       try {
           if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
               if (bal>amt){
                   try{
                   System.out.println(Thread.currentThread().getName()+"Proceeding your request...");

                       Thread.sleep(3000);
                       bal-=amt;
                       System.out.println(Thread.currentThread().getName()+"Transaction Successful of "+amt+" Remaining bal "+bal);
                   } catch (InterruptedException e) {

                   }finally {
                       lock.unlock();
                   }

               }
               else {
                   System.out.println(Thread.currentThread().getName()+"Insufficient Balance "+bal);
               }
           }else {
               System.out.println(Thread.currentThread().getName()+" could not acquire the lock, will try later");
           }
       } catch (InterruptedException e) {}
    }

}
