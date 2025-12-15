package FileHandling;

import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {
    public static void main(String[] args) {
        try{
            InputStreamReader str = new InputStreamReader(System.in);
            System.out.println("Enter a number: ");
            int number = str.read();
            while (str.ready()){
                System.out.println(number);   //.read() returns an int value i.e. unicode or ASCII value
                System.out.println((char)number); //type casting the number to character
                number = str.read();
            }



            str.close();
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
