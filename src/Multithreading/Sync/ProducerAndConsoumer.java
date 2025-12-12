package Multithreading.Sync;
//Danger: Sometimes Java threads wake up for no reason
// (called a "Spurious Wakeup").
//
//If you used if, the thread would wake up,
// exit the block, and overwrite the data even if the Consumer wasn't ready.
//
//By using while(in set and get method), if it wakes up accidentally,
// it checks the flag again and goes back to sleep

class A{
    int sum;
    boolean valueSet = false;
    public synchronized void set(int sum){
        while (valueSet){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Set "+sum);
       this.sum = sum;
       valueSet = true;
       notify();

    }
    public synchronized void get(){
        while (!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Get: "+sum);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable{
    A obj;
    Producer(A obj){
        this.obj = obj;
        new Thread(this,"Producer").start();
    }
    public void run(){
       int i = 0;
       while (true){
           obj.set(++i);
           try {Thread.sleep(1000);}catch (InterruptedException e){}
       }
    }
}


class Consumer implements Runnable{
    A obj;
    Consumer(A obj){
        this.obj = obj;
        new Thread(this,"Consumer").start();
    }
    public void run(){
        while (true) {
            obj.get();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
}
public class ProducerAndConsoumer {
    public static void main(String[] args) {
        A obj = new A();
        new Producer(obj);
        new Consumer(obj);
    }
}
