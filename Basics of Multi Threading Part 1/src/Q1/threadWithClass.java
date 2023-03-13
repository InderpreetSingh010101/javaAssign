package Q1;

public class threadWithClass extends Thread {
    private String threadName;

    public threadWithClass(String threadName){
        this.threadName = threadName ;
    }

@Override
    public void run() {
    System.out.println("Thread Is Running " + threadName);

    for (int i = 0; i < 9; i++) {
        System.out.println(threadName + ", Iteration" + i);


           try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
//        throw new RuntimeException(e) ;
            e.printStackTrace();
          }
      }
   }

}
