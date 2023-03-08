package Q4;

import java.util.Optional;

//Q4. Write a program to showcase the use of optional class
public class q4 {
    public static void main(String[] args) {
        String str = null ;
//        System.out.println(str.toLowerCase());
        Optional<String> opt = Optional.ofNullable(str) ;

        System.out.println(opt.orElse("Contains Null "));
    }
}
