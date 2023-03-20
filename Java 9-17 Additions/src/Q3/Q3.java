package Q3;

import java.util.stream.IntStream;

//Use rangeClosed to create a  Stream
public class Q3 {
    public static void main(String[] args) {

        IntStream.rangeClosed(0,5).forEach(System.out::println); // inclusive last value

    }
}
