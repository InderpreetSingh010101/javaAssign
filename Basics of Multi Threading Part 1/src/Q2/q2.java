package Q2;
//2) Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool() to
// submit a list of tasks and wait for completion of all tasks.
public class q2 {
    public static void main(String[] args) {
        System.out.println("q2");




        final syncTest obj1 = new syncTest() ;


        Thread th1 = new Thread(){
            public void run(){
                obj1.test();
            }
        };
        Thread th2 = new Thread(){
            public void run(){

                obj1.test();

//                obj1.test1();

            }
        };
        Thread th3 = new Thread(){
            public void run(){
                obj1.test();
//                obj1.test1();

            }
        };

//        th1.start();
//        th2.start();

        //OUTPUT
//        Thread Thread-0Entered
//        Thread Thread-0Leaving
//        t1_Thread Thread-1Entered
//        t1_Thread Thread-1Leaving
        // As One Class Can acquire only one locks , so to solve this we use  StaticBlock

        // Implemetation Of Static Block

        System.out.println("-----------------StaticSyncBlock-----------------" );

        final syncStaticBlock sb = new syncStaticBlock() ;

        Thread th4 = new Thread(){
            public void run(){
                sb.test();
            }
        };
        Thread th5 = new Thread(){
            public void run(){
                sb.test1();
            }
        };

       th4.start();
       th5.start();

//        th3.start();


    }

}
