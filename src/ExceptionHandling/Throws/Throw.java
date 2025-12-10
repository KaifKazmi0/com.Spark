package ExceptionHandling.Throws;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
       for (int i=1;i<=5;i++){
          try{
              System.out.print("Enter age: ");
              electionEligible(n=sc.nextInt());
          }catch (Exception e){
              System.out.println("Error: "+e.getMessage());
          }finally {
              System.exit(0);
          }

           System.out.println("hey there");
       }
    }
    public static void electionEligible(int age) throws Exception{
        if (age<0){
            throw new Exception("Age can not be negative");  //Exception has checked exceptions also therefore we r using throws keyword also
        }if (age >0 && age<18){
            throw new IllegalArgumentException("Can not cast vote");// this Exception doesn't require throws keyword
        }
        System.out.println("can cast vote");
    }
}
