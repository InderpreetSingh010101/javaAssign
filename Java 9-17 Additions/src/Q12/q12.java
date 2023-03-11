package Q12;

// Demonstrate the use of Sealed Classes.

sealed class grandFather permits father , son{  // sealed class  must have subclasses

    public String str = "This is Grandfather Class" ;
    public void disp(){
        System.out.println(str);
    }
}

final class father extends grandFather{

    public void disp1(){
        System.out.println("By using final class " + str );
    }

}

  non-sealed class son extends grandFather{

   }



public class q12 {
    public static void main(String[] args) {
        System.out.println("Q12");

        grandFather gf = new grandFather();
        gf.disp();
        System.out.println("With Final Class");
        father f = new father() ;
        f.disp1();

        System.out.println("with non-sealed class");
        son s = new son() ;
        s.disp();


    }
}
