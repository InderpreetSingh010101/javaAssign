package Q8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Demonstrate the use AutoCloseable
public class Q8 {

    public static void main(String[] args) {
        System.out.println(
                "Q8"
        );

        File file = new File("test.txt");


        try(BufferedWriter br = new BufferedWriter(new FileWriter(file,true))){ //
            br.write("Text File Data");
            br.newLine();


        }catch (IOException e){
            System.out.println("Unable To Read File");
        }
    }
}
