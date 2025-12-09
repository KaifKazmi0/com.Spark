package ExceptionHandling.Throws;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {
    public static void main(String[] args)  {
        try{m1();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("hello from main");
        }

    }
    static void m1() throws FileNotFoundException {

        m2("hello.txt");
//        try
//        {m2("hello.txt");}
//        catch (Exception e){
//            System.out.println(e);
//        }


    }
    static void m2(String filename) throws FileNotFoundException {
        try{
            FileReader fis = new FileReader(filename);
        }finally {
            System.out.println("hello from m2 finally");
        }
    }

}
