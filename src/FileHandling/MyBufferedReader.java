package FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyBufferedReader {
    public static void main(String[] args) {
        try {
            // only takes reader type in it's constructor , and if we want to write System.in
            //we can't as System.in is of Stream type, but we can parse
            //simply byte to char stream , than reading char stream
            BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("You Typed: "+bs.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
