package Multithreading.Extend;

class JoinDemo extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=5;i++){
            try{sleep(1000);}catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println(currentThread().getName());
        }
    }
}

public class JoinThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        JoinDemo j = new JoinDemo();
        j.setName("Child");
        j.start();
        j.join();  //-> Executed by main thread , main thread will wait
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
