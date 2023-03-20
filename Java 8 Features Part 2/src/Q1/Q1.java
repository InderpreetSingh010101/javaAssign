package Q1;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
//  Implement following functional interfaces from java.util.function using lambdas:
//
//    Consumer
//    Supplier
//    Predicate
//    Function


//interface Consumer{
//    void consume(int a , int b) ;
//}

interface Supplier {
    String supply() ;
}

public class Q1 {
    public static void main(String[] args) {

        Consumer c1 = (a)->{
            System.out.println("Consuming  " + a);
        } ;

        c1.accept(2);



        //        supplier s1 = ()->{
//            return "Arguments Supplied" ;
//        } ;

        java.util.function.Supplier s1 = ()-> "Supplied" ;

        System.out.println(s1.get() ) ;


//        Predicate<Integer> pred = (age)->{
//            if(age > 20)
//                return true ;
//            else
//                return false ;
//        };

        Predicate<Integer> pred = (age)->age > 20  ;

        System.out.println(pred.test(22));


//input argumnt type vv     vv output argument type
        Function<Integer , Double> fn = (a)->a*a/2.0;

        System.out.println(fn.apply(4));
    }
}
