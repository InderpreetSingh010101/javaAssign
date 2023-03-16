package Q3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

// Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool() to
// submit a list of tasks and wait for completion of all tasks.
public class Q3 {
    public static void main(String[] args) {
        System.out.println("Q3");

        System.out.println("using newCachedThreadPool()");
        ExecutorService service1 = Executors.newCachedThreadPool(); // automatically creates threads if all threads are in use
          for(int i = 0 ; i < 5 ; i++){
              service1.execute(new tsk());
          }
          service1.shutdown();



        System.out.println("using newSingleThreadExecutor()");

          ExecutorService service2 = Executors.newSingleThreadExecutor(); // runs only one thread so task runs sequntially as input
        for(int i = 0 ; i < 5 ; i++){
            service2.execute(new tsk());
        }
        service2.shutdown();



        System.out.println("Using newFixedThreadPool()");
        ExecutorService service3 = Executors.newFixedThreadPool(2);
        for(int i = 0 ; i < 5 ; i++){
            service3.execute(new tsk());
        }
        service3.shutdown();
    }

    static class tsk implements Runnable{

        public void run(){
            try{
                System.out.println(Thread.currentThread().getName() + " is Running");
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                System.out.println(Thread.currentThread().getName() + " is Exiting");

            }
        }
    }
}
