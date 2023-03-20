package Q6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// Convert an Optional type into Stream
public class Q6 {
    public static void main(String[] args) {
        System.out.println("Q6");

        List<Integer> list = Arrays.asList(1,2,3,5,7,9) ;

        list.stream()
                .filter(e->e > 7)
                .findFirst().stream()
                .mapMulti((number , consumer)-> IntStream.rangeClosed(1,10).forEach(e->consumer.accept(e*number)))
                .forEach(System.out::println);


    }
}
