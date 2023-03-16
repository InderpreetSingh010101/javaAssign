package Q1;

import java.util.Random;
import java.util.concurrent.*;
//  WAP to show usage of Callable and demonstrate how it is different from Runnable
public class q1 {

    public static void main(String[] args) {
        System.out.println("Q1");
        ExecutorService service = Executors.newFixedThreadPool(10) ;

       // Running Form Runnable Interface
        System.out.println("Using Runnable");
        service.execute(new tsk1());

        System.out.println("Using Callable");

        Future<Integer> future = service.submit(new Tsk()) ;
        int res  = 0;
        try{
           res = future.get();
        }catch (InterruptedException e){
            System.out.println("Error In Getting value");
        }catch (ExecutionException e){
            System.out.println(e);
        }

        System.out.println("Result from future " +  res );

        service.shutdown();


    }
    static class Tsk implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            try{
                System.out.println("Thread Working In callable");
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            return new Random().nextInt() ;
        }
    }

    static class tsk1 implements Runnable{
        @Override
        public void run(){
            try{
                System.out.println("With runnable And Not Able to Return value from Here");
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
        }
    }
}
