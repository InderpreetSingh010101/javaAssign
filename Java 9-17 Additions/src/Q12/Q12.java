package Q12;

// Demonstrate the use of Sealed Classes.

sealed class GrandFather permits Father, Son {  // sealed class  must have subclasses

    public String str = "This is Grandfather Class" ;
    public void disp(){
        System.out.println(str);
    }
}

final class Father extends GrandFather {

    public void disp1(){
        System.out.println("By using final class " + str );
    }

}

  non-sealed class Son extends GrandFather {

   }



public class Q12 {
    public static void main(String[] args) {
        System.out.println("Q12");

        GrandFather gf = new GrandFather();
        gf.disp();
        System.out.println("With Final Class");
        Father f = new Father() ;
        f.disp1();

        System.out.println("with non-sealed class");
        Son s = new Son() ;
        s.disp();


    }
}
