package Q1;

//
//
//1) Create and Run a Thread
// using Runnable Interface and Thread class and show usage of sleep and
// join methods in the created threads.


public class q1 {



    public static void main(String[] args) {
        System.out.println("q1");


        threadWithClass th1 = new threadWithClass("Thread1");
        threadWithClass th2 = new threadWithClass("Thread2");
        threadWithClass th3 = new threadWithClass("Thread3");

//        th1.start();
//        th2.start();
//        th3.start();


        // With Runnable Interface

        usingRunableItef r1 = new usingRunableItef("Th1");
        usingRunableItef r2 = new usingRunableItef("Th2");
        usingRunableItef r3 = new usingRunableItef("Th3");


        Thread thrd1 = new Thread(r1) ;
        Thread thrd2 = new Thread(r2) ;
        Thread thrd3 = new Thread(r3) ;


        thrd1.start();


        try{
            thrd1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thrd2.start();

        try{
            thrd2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thrd3.start();

//        try{
//            thrd3.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }





    }
}
