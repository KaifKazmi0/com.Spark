package ExceptionHandling;

public class ChildToParent {
    public static void main(String[] args) {
        try {
            int a = 10/0;

        }catch (NullPointerException n){
            System.out.println(n);
            System.exit(0);
        }catch (ArithmeticException a){
            System.out.println(a);
            System.exit(0);
        }catch (Exception e){
            System.out.println(e);
            System.exit(0);
        }finally {
            System.out.println("hello from finally");
        }
        System.out.println("hey there");
    }
}
