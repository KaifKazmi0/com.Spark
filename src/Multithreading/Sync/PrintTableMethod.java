package Multithreading.Sync;

public class PrintTableMethod {
    public void printTable(int n){

        synchronized (this) {
        for (int i=1;i<=5;i++) {

            System.out.println(Thread.currentThread().getName() + "--" + n * i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
           }
    }
}
