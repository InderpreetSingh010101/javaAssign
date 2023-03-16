package Q4;

import java.util.Random;
import java.util.concurrent.*;

public class Q4 {
    public static void main(String[] args) {
         ExecutorService service = Executors.newFixedThreadPool(3) ;

         for(int i = 0 ; i < 5 ; i++){

             Future<Integer> future = service.submit(new task()) ;
             try{
                 System.out.println(future.get());
             }catch (InterruptedException e){

             }catch (ExecutionException e){

             }

         }

         service.shutdown();

    }

    static class task implements Callable<Integer> {
         @Override
         public Integer call() throws Exception {


             try{
                 System.out.println("Thread Working " + Thread.currentThread().getName());
                 Thread.sleep(2000);
             }catch (InterruptedException e){
                 e.printStackTrace();
             }
             return new Random().nextInt() ;
         }
     }

}
