package Multithreading.VolatileExmpl;


class Resource{
    private volatile boolean flag = false;

    public void setFlag(){
        System.out.println("Flag is set to true");
        this.flag = true;
    }

    public void readFlag(){
        while (!flag){
            //do nothing
        }
        System.out.println("Flag is true...");
    }

}

public class Demo {
    public static void main(String[] args) {
        Resource r = new Resource();
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            r.setFlag();
        });
        Thread t2 = new Thread(()->{
            r.readFlag();
        });

        t1.start();
        t2.start();
    }
}
