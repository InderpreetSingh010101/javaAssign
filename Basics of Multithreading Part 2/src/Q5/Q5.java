package Q5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Q5");

        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new Task());
        service.execute(new Task());

        System.out.println("isTerminated " + service.isTerminated());
        System.out.println("ShutDown()");
        service.shutdown();
//                           service.execute(new Task());

        // ShutDownNow
        // similar to shutDown But Running Thread is Interrupted

        System.out.println("isTerminated " + service.isTerminated());
        System.out.println("ShutDownNow()");
        service.shutdownNow();




    }

    static class Task implements Runnable{
        public void run(){

            try{
                System.out.println("Thread " + Thread.currentThread().getName() + " Is working");
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Thread Interuppted By ShutDownNow()");
                }
                Thread.sleep(2000);

            }catch (InterruptedException e){
                e.printStackTrace() ;
            }finally {
                System.out.println("Thread Is Leaving" + Thread.currentThread().getName());
            }
        }
    }
}
