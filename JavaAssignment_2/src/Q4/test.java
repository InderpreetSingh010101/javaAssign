package Q4;

public class test {
    public void run() throws CustomExceptionI {
        int r = 0 ;
        if(r == 0 ){
            System.out.println("Test Executing , Throwing Error Now");
            throw new CustomExceptionI("This Is Custom Exception");
        }

    }

//    public void run1() throws ClassNotFoundException {
//        int r = 0 ;
//        if(r == 0 ){
//            System.out.println("Test Executing , Throwing Error Now");
//            throw new ClassNotFoundException();
//        }
//
//    }
//    public void run1() throws ClassNotFoundException{
//        int r = 0 ;
//        if(r == 0 ){
//            System.out.println("Test Executing , Throwing Error Now");
//            throw new ClassNotFoundException("ClassNotFound  Error Occured");
//        }
//
//    }
}
