package Q2;

// Q2) Using (instance) Method reference create and apply add and subtract method and using
// (Static) Method reference create and apply multiplication method for the functional interface created
public class Q2 {
    public static void main(String[] args) {

    Calculator cal = new Calculator();

    Functional_Interface fn = cal::sum;

        System.out.println(fn.calculation(3,4));

        fn = cal::subtract;

        System.out.println(fn.calculation(4,2));

        fn = Calculator::multiplication ;  // static method referencing

        System.out.println(fn.calculation(3,4));






    }
}
