package Multithreading.Sync;

public class MyThread extends Thread{
    PrintTableMethod obj;
    MyThread(PrintTableMethod obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        obj.printTable(10);
    }

}
