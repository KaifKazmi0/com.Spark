package ExceptionHandling.Throws;

public class ThrowThrows {
    public static void main(String[] args) {
        ageCalculator(16);  // will manage by DefaulExceptionHandler as it is an unchecked exception
//        try{
//            ageCalculator(-15);
//        }catch (Exception e){
//            System.out.println("Error: "+e.getMessage());
//        }
    }
    static void ageCalculator(int age) throws ArithmeticException{
        if (age<0){
            throw new ArithmeticException("Age cannot be negative");
        }if(age<18){
            throw new ArithmeticException("Below age");
        }
        System.out.println("over");
    }
}
