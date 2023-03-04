package Q_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q3 {
    //Write a program to count number of occurrences of a word in a file.
    // The file name and word should be supplied through commandline.


    public static int charCinString(String str , String c){

        String[] split_str = str.split("\\s+"); // Words ka array on split of space

        int count = 0 ;
        for(int i = 0 ; i < split_str.length ; i++){
            if(split_str[i].equalsIgnoreCase(c)){
                count ++ ;
            }

        }
        return count ;
    }


    public static void main(String[] args) {
         String ss ;
         String f_loc;
        Scanner scn = new Scanner(System.in) ;

        System.out.println("Enter the Name Of Test File ");
        f_loc = scn.nextLine();

        System.out.println("Enter the word for count Calculation");
        ss = scn.nextLine();
//        char cc = ss.charAt(0);

        System.out.println("Reading..");
        try{
            File file = new File(f_loc) ;
            FileReader fr = new FileReader(file) ;
            BufferedReader  br = new BufferedReader(fr) ;
            String line ;
            int count = 0 ;
            while( (line = br.readLine()) != null){
                System.out.println(line);
               count+= charCinString(line , ss) ;
            }
            System.out.println("Count is " +  count);

        }catch(IOException e){
            System.out.println("File Not Found");
        }





    }
}
