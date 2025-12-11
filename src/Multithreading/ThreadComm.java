package Multithreading;

public class ThreadComm {
    public static void main(String[] args) throws InterruptedException{
        ThreadA t1 = new ThreadA("babli");
        ThreadA t2 = new ThreadA("banti");

        t1.start();
        t2.start();

        synchronized (t1){ System.out.println(t1.total);
            System.out.println("Main thread waits here");
            t1.wait();
            System.out.println("Main thread gets notify");

        }
    }
}

class ThreadA extends Thread{
    int total = 0;
    String childName;
    ThreadA(String childName){
        this.childName = childName;
    }
    synchronized public void run(){
        System.out.println("Child thread start here "+childName);
        for (int i=1;i<=100;i++){
            total+=i;
        }
        System.out.println("Child thread notify "+childName);notify();

    }
}
