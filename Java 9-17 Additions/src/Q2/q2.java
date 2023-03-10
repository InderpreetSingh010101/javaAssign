package Q2;

import java.util.Arrays;
import java.util.List;

// Q2 Perform takeWhile and dropWhile operations on stream
public class q2 {

    public static void main(String[] args) {

      List<Integer> integrList = Arrays.asList(1,2,3,4,5,6,7,8,9) ;

        System.out.println("Using take while");

        integrList.stream()
                .takeWhile(e->e<5) // only less then 5 exclusive of 5
                .forEach(System.out::println);


        System.out.println("Drop While");
        integrList.stream()
                .dropWhile(e->e < 5) // more then 5 inclusive of 5
                .forEach(System.out::println);


    }
}
