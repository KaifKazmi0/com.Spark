package Multithreading.ThreadPool;

public class ManualThreads {




    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();

        Thread[] thread = new Thread[10];

        for (int i = 0; i <= 9; i++) {
            final int finalI = i;
             thread[i] = new Thread(
                    () -> {
                        long result = factorial(finalI);
                        System.out.print(result);
                        System.out.println(" time: " + (System.currentTimeMillis() - starttime));
                    }
            );
            thread[i].start();

        }

        for(Thread t: thread){  //-> stopping the main thread for each threads
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }



        System.out.println("Total time: " + (System.currentTimeMillis() - starttime));

    }

    static long factorial(int x)  {
        int result =1;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i=0;i<=x;i++){
            result*=i+1;
        }
        return result;
    }
}
