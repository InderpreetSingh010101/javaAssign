package Q2;

public class SyncStaticBlock {

    Object lock1 = new Object() ;
    Object lock2 = new Object() ;
     public void test(){
         synchronized (lock1){
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
         synchronized (lock2) {

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
