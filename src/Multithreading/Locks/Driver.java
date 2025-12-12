package Multithreading.Locks;

public class Driver {
    public static void main(String[] args){
        BankAccount1 SBI = new BankAccount1();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                SBI.withdraw(100);
            }
        };

        Thread t1 = new Thread(task,"Thread1");
        Thread t2 = new Thread(task,"Thread2");

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
        }

        System.out.println(SBI.bal);
    }
}
