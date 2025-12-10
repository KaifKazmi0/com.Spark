package Practice;


class MultithreadEG extends Thread{
    private int threadnum;
    public MultithreadEG(int threadnum) {
        this.threadnum = threadnum;
    }

    @Override
    public void run(){
        for (int i=0;i<=2;i++){
            System.out.println("hello from thread "+threadnum);
        }
    }
}

public class P1 {
    public static void main(String[] args) {
       for (int i=0;i<=5;i++){
           MultithreadEG m = new MultithreadEG(i);
           m.start();
       }



    }
}
