package Q_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//) Create a User class with fields:  firstname, lastname, age, phonenumber.
// Write a program which accepts values of user fields from commandline,
// create object and append that to a text file.
// After every user creation the program should prompt: "Do you want to continue creating users?
// (Type QUIT to exit)" and keep on accepting values and writing to file unitl user quits.
public class Q2 {
    public static void main(String[] args){
        System.out.println("Hello");
        Scanner scn = new Scanner(System.in) ;

        File file = new File("test.txt");


        // File Writer can take 2 parameters 1st is File argument 2nd is true which append true or false
        String s = "" ;

        while(s.equalsIgnoreCase("quit") != true ){
//            System.out.println("Enter Id ");
//            int id = scn.nextInt() ;

            System.out.println("Enter the Details");

            System.out.println("Enter the FirstName");
            String F_name = scn.nextLine() ;
            System.out.println("Enter the LastName") ;
            String L_name = scn.nextLine() ;

            System.out.println("Enter the Age") ;
            int age = scn.nextInt() ;

            System.out.println("Enter The Phone Number");
            int phone = scn.nextInt() ;
            scn.nextLine(); // After We take input from

            singleTclass s1 = singleTclass.getInstance(F_name,L_name ,age , phone) ;
            System.out.println(s1.showDetails());

            try(BufferedWriter br = new BufferedWriter(new FileWriter(file,true))){ //
                br.write(s1.showDetails());
                br.newLine();


            }catch (IOException e){
                System.out.println("Unable To Read File");
            }

            System.out.println("Do You Want to  Enter More");
            s = scn.nextLine() ;
        }

    }
}
