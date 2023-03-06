package Q3;
// Implement multiple inheritance with default method inside interface.

interface i1 {
    default void show(){
        System.out.println("At Parent 1");
    };


}

interface i2 extends i1{
    default void show(){
        System.out.println("At Parent 2");
    };


}

class child implements i1 , i2 {
    public void show(){
        System.out.println("At Child");
    }
}



public class q3 {


    public static void main(String[] args) {
           child c = new child() ;
           c.show();


    }
}
