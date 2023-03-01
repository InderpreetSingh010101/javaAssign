package Q4;

public class Q4 {

//WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
    public static void main(String[] args) {
        test t = new test();

        try {
            t.run();
        } catch (CustomExceptionI e) {
            System.out.println(e);
        }
    }


}
