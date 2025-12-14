package Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    Lock lock = new ReentrantLock();
    public void outterMethod(){
        lock.lock();  //lock ->1
        try{
            System.out.println("outter block");
            innerMethod(); //called another method which also have lock
        }finally {
            lock.unlock(); //lock -> lock -1 = 0;
        }
    }

    public void innerMethod(){
        lock.lock(); //lock -> 2
        try {
            System.out.println("inner method block");
        }finally {
            lock.unlock(); // lock -> lock -1 = 1;
        }
    }

    public static void main(String[] args) {
        ReentrantExample obj = new ReentrantExample();
        obj.outterMethod();
    }
}
