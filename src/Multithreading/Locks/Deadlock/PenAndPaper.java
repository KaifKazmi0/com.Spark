package Multithreading.Locks.Deadlock;


class Pen{

    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" is trying to using "+ this+" and Pen");
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished writing "+this   );
    }



}

class Paper{

    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName()+" is trying to write using "+this+" and Paper");
        pen.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished writing "+this   );
    }
}

class Task1 implements Runnable{
    Pen pen;
    Paper paper;

    Task1(Pen pen,Paper paper){
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);  //thread1 locks pen , tries to acquire lock paper
    }
}


class Task2 implements Runnable{
    Pen pen;
    Paper paper;

    Task2(Pen pen,Paper paper){
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        synchronized (pen){  // thread2 will run only when it gets lock of pen
            paper.writeWithPaperAndPen(pen);
        }
        //  paper.writeWithPaperAndPen(pen); //thread2 locks paper, tries to acquire lock pen
    }
}



public class PenAndPaper {

    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Task1 task1 = new Task1(pen,paper);
        Task2 task2 = new Task2(pen,paper);

        Thread thread1 = new Thread(task1,"thread1");
        Thread thread2 = new Thread(task2,"thread2");

        thread1.start();
        thread2.start();
    }
}
