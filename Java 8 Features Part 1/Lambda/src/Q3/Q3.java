package Q3;
// Implement multiple inheritance with default method inside interface.

interface I1 {
    default void show(){
        System.out.println("At Parent 1");
    };


}

interface I2 extends I1 {
    default void show(){
        System.out.println("At Parent 2");
    };


}

class Child implements I1, I2 {
    public void show(){
        System.out.println("At Child");
    }
}



public class Q3 {


    public static void main(String[] args) {
           Child c = new Child() ;
           c.show();


    }
}
