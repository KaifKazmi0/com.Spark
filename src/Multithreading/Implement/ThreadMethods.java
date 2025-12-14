package Multithreading.Implement;
//run
//start
//getName
//setName
//serPriority

class Thread1 implements Runnable{
    @Override
    public void run(){

            System.out.println("Thread Name: "+Thread.currentThread().getName());

    }
}


class Thread2 implements Runnable{
    @Override
    public void run(){

            System.out.println("Thread Name: "+Thread.currentThread().getName());

    }
}
public class ThreadMethods {
    public static void main(String[] args) {
//        Thread1 t = new Thread1();
//        Thread t1 = new Thread(t);

        Thread t1 = new Thread(new Thread1());
//        t1.start();

        Thread t2 = new Thread(new Thread2());
//        t2.start();

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        //priority
        t1.setPriority(1);
        t2.setPriority(3);

        //NameOfThraed
         t1.setName("and");
         t2.setName("or");


        t1.start();                 //this will run last, priority -> 2
        t2.start();                 //this will run 2nd last as the priority -> 3


        System.out.println(t1.getPriority());        // priority is 5 main.thread ->5
        System.out.println(t2.getPriority());         // priority is 5 main.thread ->5


    }
}
