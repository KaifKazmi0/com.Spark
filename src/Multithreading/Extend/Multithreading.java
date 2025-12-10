package Multithreading.Extend;

public class Multithreading extends Thread{
    private int threadNumber;
    public Multithreading(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println(i+" this is from Thread "+threadNumber);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
