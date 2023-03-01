package Q2;

// WAP showing try, multi-catch and finally blocks.

import java.io.File;
import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        int y = 7 ;
        try{
            int x = y / 0 ;
        }catch (ArithmeticException e){
            System.out.println("Divide by Zero Not Possible");
        }catch(Exception e){
            System.out.println("Runtime Exception handled");
        }

        System.out.println("This I d will be executed") ;


    }
}
