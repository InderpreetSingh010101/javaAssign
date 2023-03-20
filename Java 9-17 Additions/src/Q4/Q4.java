package Q4;

import java.util.stream.Stream;

// Use iterator stream method to generate a stream
public class Q4 {
    public static void main(String[] args) {
        Stream<Integer> st = Stream.iterate(1 , i->i<=10 ,i->i+1) ;

        st.forEach(System.out::println);

        // or

//        Stream.iterate(1 , i->i<=10 ,i->i+1).forEach(System.out::println);

//         IntStream.iterate(1 , i->i<=10 , i->i+2).forEach(System.out::println);
    }
}
