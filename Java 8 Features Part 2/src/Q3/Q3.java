package Q3;

import java.util.ArrayList;
import java.util.List;


//  Sum all the numbers greater than 5 in the integer list using streams
public class Q3 {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>() ;
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(4);
        list.add(3);

        System.out.println( list.stream()
                 .filter((e)-> e>5 )
                .reduce(0,(a,b)->a+b)
        );

    }
}
