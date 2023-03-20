package Q9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Create Unmodifiable List from a Steam
public class Q9 {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1,2,3,4,5,6).filter(e->e%2 != 0)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(list);
        list.add(1) ; // THROWS ERROR
    }
}
