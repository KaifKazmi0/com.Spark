package Multithreading.Extend.ThreadBasicMethods;

class Thread1 extends Thread{
    @Override
    public void run(){
        try{
            sleep(6000);
        }catch (InterruptedException e){}
        for (int i=1;i<=10;i++){
            System.out.println(getName()+" ----"+i);
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){

        for (int i=1;i<=10;i++){
            try{
                sleep(1000);
            }catch (InterruptedException e){}
            System.out.println(getName()+" ----"+i);
        }
    }
}

public class SleepThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
