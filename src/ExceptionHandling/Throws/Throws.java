package ExceptionHandling.Throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void main(String[] args) throws Throwable {
        m1();
    }

    public static void m1() throws FileNotFoundException{
        fileRead("nothing.txt");
        System.out.println("Bye from m2");
    }
    public static void fileRead(String filename) throws FileNotFoundException {
         try{
             FileReader fis = new FileReader(filename);
            System.out.println(fis);
            }catch (Throwable t)     {
             System.out.println(t.getMessage());
         }

    }
}
