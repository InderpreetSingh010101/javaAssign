package Q3;
//  3) WAP to showcase the usage of volatile in java.

import java.util.Scanner;

class processor extends Thread{


    private  boolean running = true ;

   @Override
    public void run(){
        while(running){

           Thread.yield();
            try{
                Thread.sleep(100
                );
            }catch (InterruptedException e){

            }
            System.out.println(Thread.currentThread().getName() + "Running");
        }
    }

    public void closeThread(){
       this.running = false ;
        System.out.println("STOPPING");
    }
}
 public class q3 {

    public static void main(String[] args) {
        System.out.println("Q3");

        processor p1 = new processor() ;

        p1.start();

        System.out.println("Press Enter To Stop The Process");
        Scanner scn = new Scanner(System.in) ;
        scn.nextLine() ;

        p1.closeThread();

    }

}
