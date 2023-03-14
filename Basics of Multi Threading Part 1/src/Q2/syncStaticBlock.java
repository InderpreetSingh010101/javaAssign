package Q2;

import java.util.Objects;

public class syncStaticBlock {


     public void test(){
         synchronized (this){
        try{
            System.out.println(" Thread " + Thread.currentThread().getName() + "Entered");
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
            finally {
            System.out.println("Thread " + Thread.currentThread().getName() + "Leaving");

        }
        }
    }
     public void test1() {
         synchronized (this) {

             try {
                 System.out.println("t1_Thread " + Thread.currentThread().getName() + "Entered");
                 Thread.sleep(1000);
             } catch (Exception e) {
                 System.out.println(e);
             } finally {
                 System.out.println("t1_Thread " + Thread.currentThread().getName() + "Leaving");

             }

         }
     }
}
