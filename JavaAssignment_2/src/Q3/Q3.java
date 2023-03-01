package Q3;

public class Q3 {

//WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
    public static void main(String[] args){
        test t = new test();

        try{
             t .run();
        }catch (NoClassDefFoundError e){
               System.out.println(e);
        }

        try{
            t .run1();
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
//        catch (ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
    }

}
