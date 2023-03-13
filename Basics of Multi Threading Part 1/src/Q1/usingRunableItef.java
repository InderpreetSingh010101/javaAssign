package Q1;

public class usingRunableItef implements Runnable {
    private String threadName;

    public usingRunableItef(String threadName){
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

        System.out.println("Ending Thread :- " + threadName);
    }

}