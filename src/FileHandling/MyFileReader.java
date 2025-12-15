package FileHandling;

import java.io.*;
import java.io.IOException;

public class MyFileReader {
    public static void main(String[] args) {
        try {FileReader fr = new FileReader("Hello.txt");
         int number = fr.read();
            while (fr.ready()){
                System.out.println(number);  //.read() returns an int value i.e. unicode or ASCII value
                System.out.println((char)number);  //type casting the number to character
                number = fr.read();
            }

//            fr.close();
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
