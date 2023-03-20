package Q1;

import java.util.ArrayList;
import java.util.Iterator;

//  Write Java code to define List .
//  Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
public class Q1 {
    public static void main(String[] args) {


        ArrayList<Double> ls = new ArrayList<>();

        ls.add(1.12345);
        ls.add(2.12345);
        ls.add(3.12345);
        ls.add(4.22345);

          Double sum = 0.0 ;
        Iterator<Double> listitr = ls.iterator();

//        listitr.next() ;
//        listitr.remove();

        while(listitr.hasNext()){
            Double val = listitr.next() ;
            sum += val ;
            System.out.println(val);
        }

        System.out.println("The Sum is :- " + sum);





    }
}
