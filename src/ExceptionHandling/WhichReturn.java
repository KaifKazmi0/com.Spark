package ExceptionHandling;

public class WhichReturn {
    public static void main(String[] args) {
        System.out.println(num());
    }
    static int num(){
        try {
            return 3;
        }catch (Exception e){
            return 2;
        }finally {
            return 1;
        }
    }
}
