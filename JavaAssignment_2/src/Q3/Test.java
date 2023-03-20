package Q3;

public class Test {
    public void run() throws NoClassDefFoundError {
        int r = 0 ;
        if(r == 0 ){
            System.out.println("Test Executing , Throwing Error Now");
            throw new NoClassDefFoundError();
        }

    }

    public void run1() throws ClassNotFoundException {
        int r = 0 ;
        if(r == 0 ){
            System.out.println("Test Executing , Throwing Error Now");
            throw new ClassNotFoundException();
        }

    }
//    public void run1() throws ClassNotFoundException{
//        int r = 0 ;
//        if(r == 0 ){
//            System.out.println("Test Executing , Throwing Error Now");
//            throw new ClassNotFoundException("ClassNotFound  Error Occured");
//        }
//
//    }
}
