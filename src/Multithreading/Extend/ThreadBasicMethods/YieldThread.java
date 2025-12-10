package Multithreading.Extend.ThreadBasicMethods;

class Threadx extends Thread{
    private String name;
    Threadx(String name){
        this.name = name;
    }
    @Override
    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"  "+name+"  "+i);
            Thread.yield(); // -> this just signals the OS(TS) that it is willing to stop but getting stop or not completely depends on OS
         }

    }
}

public class YieldThread {
    public static void main(String[] args) {
        Threadx th = new Threadx("first");
        Threadx th1 = new Threadx("second");

        th.start();
        th1.start();
    }
}
