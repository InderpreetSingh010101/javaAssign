package Q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Use rangeClosed to create a  Stream
public class q3 {
    public static void main(String[] args) {

        IntStream.rangeClosed(0,5).forEach(System.out::println); // inclusive last value

    }
}
