package Multithreading;

public class Demo {
    public static void main(String[] args) {
       for (int i =0;i<=5;i++){
           Multithreading m = new Multithreading(i);
           m.start();
       }

    }
}
