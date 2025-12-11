package Multithreading.Sync;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        PrintTableMethod obj = new PrintTableMethod();
        MyThread t1 = new MyThread(obj);
        MyThread t2 = new MyThread(obj);

        t1.setName("ram");
        t2.setName("shaam");
        t2.setPriority(1);




        t1.start();
        t2.start();
        System.out.println("-------sync--------");


        t1.join(); // -> main thread will be stoped by OS
        System.out.println("hey");
        t2.join();  // -> main thread will be stoped by OS

        for (int i=1;i<=5;i++){
            System.out.println("hello from main thread");
        }
    }
}
