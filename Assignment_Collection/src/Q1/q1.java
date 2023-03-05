package Q1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {


        ArrayList<Double> ls = new ArrayList<>();
        ListIterator<Double> listitr = ls.listIterator();

        listitr.add(1.12345);
        listitr.add(2.12345);
        listitr.add(3.12345);
        listitr.add(4.22345);

          Double sum = 0.0 ;
        while(listitr.hasPrevious()){
            Double val = listitr.previous() ;
            sum += val ;
            System.out.println(val);
        }

        System.out.println("The Sum is :- " + sum);





    }
}
