package ExceptionHandling;

public class ExceptionInDepth {
    static void m1(){
        m2();
        System.out.println("hello from m1");
    }

    static void m2(){
        m3();
        System.out.println("hello from m2");
    }

    static void m3(){
        int a = 10/0;
        System.out.println("hello from m3");
    }

    public static void main(String[] args) {
        try {
            m1();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("hello from main");  //only this will be printed since above method have been remved from stack
    }
}
