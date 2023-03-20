package Q1;

//
//
//1) Create and Run a Thread
// using Runnable Interface and Thread class and show usage of sleep and
// join methods in the created threads.


public class Q1 {



    public static void main(String[] args) {
        System.out.println("q1");


        ThreadWithClass th1 = new ThreadWithClass("Thread1");
        ThreadWithClass th2 = new ThreadWithClass("Thread2");
        ThreadWithClass th3 = new ThreadWithClass("Thread3");

//        th1.start();
//        th2.start();
//        th3.start();


        // With Runnable Interface

        UsingRunableItef r1 = new UsingRunableItef("Th1");
        UsingRunableItef r2 = new UsingRunableItef("Th2");
        UsingRunableItef r3 = new UsingRunableItef("Th3");


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
