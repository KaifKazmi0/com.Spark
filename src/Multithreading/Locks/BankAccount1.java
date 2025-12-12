package Multithreading.Locks;

public class BankAccount1 {
    int bal = 1000;

    public synchronized void withdraw(int amt){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw...");
        if (bal>amt){
            System.out.println(Thread.currentThread().getName()+" proceeding with withdraw");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName()+" withdrawal successful of "+amt);
            bal-=amt;
        }else {
            System.out.println(Thread.currentThread().getName()+" Insufficient balance "+bal);
        }
    }
}
