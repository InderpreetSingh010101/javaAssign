package Q5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

//Use ifPresentOrElse, or, orElseThrow Operations with Optional
public class q5 {

    public static void main(String[] args) throws Exception{
         IntStream itg = IntStream.range(0,6) ;

         itg.filter(e->e>6)
                 .findFirst()
                 .ifPresentOrElse(System.out::println , ()->System.out.println("No Value"));

         // Or mthod

        System.out.println("or implementation");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6) ;


        list.stream()
                .filter(e->e > 4)
                .findFirst()
                .or(()-> Optional.of(-1))
                .ifPresent(System.out::println ) ;

        // orElse
        list.stream()
                .filter(e->e > 6)
                .findFirst()
                .orElseThrow(()->new Exception("Element Not Found") ) ;




    }
}
