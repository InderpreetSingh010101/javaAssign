//package Q4;
//
//import java.util.concurrent.locks.ReentrantLock;
//
//public class testClass {
//
//    ReentrantLock lock1 = new ReentrantLock() ;
//    ReentrantLock lock2 = new ReentrantLock() ;
//
//    public void mthd1(){
//
//
//        for(int i = 0 ;  i< 1000 ; i++) {
//                    lock1.lock();
//        lock2.lock();
//            try {
//
//                System.out.println("Thread :-" + Thread.currentThread().getName() + "Acquired Lock1 and lock 2");
////                Thread.sleep(2000);
//
//            }  finally {
//                System.out.println("Thread :-" + Thread.currentThread().getName() + "Acquired UnLock1 and Unlock 2");
//             lock1.unlock() ;
//             lock2.unlock();
//            }
//        }
//
//
//    }
//
//
//    public void mthd2(){
//
////        lock2.lock();
////        lock1.lock();
//
//        for(int i = 0 ; i  < 1000 ;  i++) {
//            try {
//        lock2.lock();
//        lock1.lock();
//
//                System.out.println("Thread :-" + Thread.currentThread().getName() + "Acquired Lock1 and lock 2");
////                Thread.sleep(2000);
//
//            }  finally {
//                System.out.println("Thread :-" + Thread.currentThread().getName() + "Acquired UnLock1 and Unlock 2");
//            lock1.unlock() ;
//            lock2.unlock();
//            }
//        }
//    }
//}
