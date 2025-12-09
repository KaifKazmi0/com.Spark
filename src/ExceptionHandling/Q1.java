package ExceptionHandling;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(hello());
    }
    static int hello(){
        try{
            return 4;
        }finally {
            //first this one wiil run as return will close the method
            System.out.println(" hello from finally");
        }
    }
}
