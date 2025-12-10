package Multithreading.Extend;

class Addition{
    int sum = 0;
    synchronized void add(){
        sum = sum +1;
    }
}

class Thread1 extends Thread{
    Addition obj;

    Thread1(Addition obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        for (int i=0;i<100000;i++){
            obj.add();
        }
    }
}

class Thread2 extends Thread{
    Addition obj;

    Thread2(Addition obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        for (int i=0;i<100000;i++){
            obj.add();
        }
    }
}


public class Synchronized {
    public static void main(String[] args) throws InterruptedException{
        Addition obj = new Addition();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(obj.sum);
    }
}
