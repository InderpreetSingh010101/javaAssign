public class Main {

    public static void test()throws Exception{
     //   test1();
       try{
           test1() ;
           System.out.println("Try");
       }
//       catch (ArithmeticException e){
//
//       }
       finally {
           System.out.println("Finally");
       }

    }
    public static void test1() throws Exception {

    //   throw new Exception("this") ;
        throw new ArithmeticException("Not Possible");

    }
    public static void main(String[] args)  throws Exception {

        System.out.println("Hello world!");
        test();
        System.out.println("Main");


    }
}