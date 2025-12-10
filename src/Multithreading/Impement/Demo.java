package Multithreading.Impement;

class MyNewThread implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Thread Name: "+Thread.currentThread().getName());
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        MyNewThread n = new MyNewThread();
        Thread t = new Thread(n);
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("Thread Name: "+Thread.currentThread().getName());
        }
    }
}
