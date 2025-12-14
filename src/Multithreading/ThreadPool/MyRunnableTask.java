package Multithreading.ThreadPool;

public final class MyRunnableTask implements Runnable{
  @Override
    public void run(){
      try {
          Thread.sleep(10000);
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
      }
  }

}
