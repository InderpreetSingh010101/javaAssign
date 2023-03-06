package Q2;

// Q2) Using (instance) Method reference create and apply add and subtract method and using
// (Static) Method reference create and apply multiplication method for the functional interface created
public class q2 {
    public static void main(String[] args) {

    calculator cal = new calculator();

    functional_Interface fn = cal::sum;

        System.out.println(fn.calculation(3,4));

        fn = cal::subtract;

        System.out.println(fn.calculation(4,2));

        fn = calculator::multiplication ;

        System.out.println(fn.calculation(3,4));






    }
}
