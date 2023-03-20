package Q7;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Use Of method to create List, Set and Map
public class Q7 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9) ;
        System.out.println(list);

        System.out.println( Set.of(1,2,3,4,5,6,7) ) ;

        System.out.println(Map.of(1,"Val1" , 2 , "val2" , 3 , "val3"));



    }
}
