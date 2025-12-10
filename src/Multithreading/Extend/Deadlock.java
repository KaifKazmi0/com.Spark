package Multithreading.Extend;

public class Deadlock {
    static class A {}
    static class B {}


    public static void main(String[] args) {
            A resource1 = new A();
            B resource2 = new B();

            Thread t1 = new Thread(() -> {
                synchronized(resource1) {
                    System.out.println("Thread 1: Locked resource1");
                    try { Thread.sleep(50); } catch(Exception e) {}
                    synchronized(resource2) {
                        System.out.println("Thread 1: Locked resource2");
                    }
                }
            });

            Thread t2 = new Thread(() -> {
                synchronized(resource2) {
                    System.out.println("Thread 2: Locked resource2");
                    try { Thread.sleep(50); } catch(Exception e) {}
                    synchronized(resource1) {
                        System.out.println("Thread 2: Locked resource1");
                    }
                }
            });

            t1.start();
            t2.start();
        }


}
