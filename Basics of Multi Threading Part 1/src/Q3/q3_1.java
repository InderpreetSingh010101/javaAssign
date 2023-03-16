package Q3;

public class q3_1 {

    public volatile static int countr = 0 ;

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            int chk = countr ;

            while(chk < 10){

                if(chk != countr) {
                    System.out.println("[T1] notice the counter**");
                    chk = countr ;
                }
            }
        });


        Thread t2 = new Thread(()->{
           int chk = countr ;
           while(chk < 10){
               System.out.println("T2 encounter" + chk + 1);
               countr = ++chk ;


               try{
                   Thread.sleep(1000);
               }catch (InterruptedException e){

               }
           }
        });

        t1.start();
        t2.start();
    }
}
