package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNWrite {
    public static void main(String[] args) {
        //create
        try {
            File fs = new File("New-file.txt");
            fs.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //write
        try{
            FileWriter fw = new FileWriter("New-file.txt");
            fw.write("Hello, how are u doin brah...!");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
