package Multithreading.Locks;

public class Driver2 {
    public static void main(String[] args) {
        BankAccount2 Kotak = new BankAccount2();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                Kotak.withdraw(150);
            }
        };


        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){}

        System.out.println("Remaining balance: "+Kotak.bal);
    }
}
