package Q2;


//Create and access default and static method of an interface.

interface Test {
    default void show(){
        System.out.println("Default  Method is called");
    }

    static void fn(){
        System.out.println("Static Interface Method is Called");
    }
}
public class Q2 implements Test {

    public static void main(String[] args) {
        Q2 obj = new Q2() ;

        obj.show() ; // Default method of interface is called

        Test.fn(); // Static method of interface is called
    }

}
