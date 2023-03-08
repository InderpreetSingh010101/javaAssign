package Q2;


//Create and access default and static method of an interface.

interface test{
    default void show(){
        System.out.println("Default  Method is called");
    }

    static void fn(){
        System.out.println("Static Interface Method is Called");
    }
}
public class q2 implements test{

    public static void main(String[] args) {
        q2 obj = new q2() ;

        obj.show() ; // Default method of interface is called

        test.fn(); // Static method of interface is called
    }

}
