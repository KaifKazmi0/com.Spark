package ExceptionHandling;

public class IllegalArgmtE {
    public static void main(String[] args) {
        sqrt(-9);
    }
    static double sqrt(int n){
        try {
            if(n<0) {
                throw  new IllegalArgumentException("ye galat kr rhe h aap");
            }
            return Math.sqrt((double) n);
        }catch (Exception e){
            System.out.println("Error: kya chedda bhsdi "+e.getMessage());
            return -1;
        }
    }

}
