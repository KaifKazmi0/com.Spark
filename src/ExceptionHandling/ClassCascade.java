package ExceptionHandling;

public class ClassCascade {
    public static void main(String[] args) {
        int x = 65;
        char ch = (char)x;
        System.out.println(ch);

      try {
          Object obj = "Hello";// Actually a String But using the Object class
//          String obj = "Hello"; -> this will through error
          Integer num = (Integer) obj;   // Wrong cast
          System.out.println(num);

      }catch (Exception e){
          System.out.println("Error: "+e.getMessage());
      }finally {
          System.out.println("kya chedda bsdi");
      }


    }
}
