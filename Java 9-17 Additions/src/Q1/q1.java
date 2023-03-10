package Q1;

//1.Demonstrate the use of private methods in interfaces
interface staticInsideInterf{


    private static String rev(String str){
        return new StringBuffer(str).reverse().toString() ;
    }
    static String toUpr(String str){
        return str.toUpperCase() ;
    }
    static String toUpr1(String str){
        String s = rev(str) ;
        return s.toUpperCase() ;
    }


}

public class q1 {

    public static void main(String[] args) {
     System.out.println(staticInsideInterf.toUpr("this should be in uppercase"));
      System.out.println(staticInsideInterf.toUpr1("ETAVIRP YB ETAVIRP HTIW ESACREPPU NI EB DLUOHS SIHT"));
    }
}
