package Q2;

import java.util.concurrent.locks.ReentrantLock;

// Improve the code written in Basics of Multi Threading Part 1
// exercise question 4 to handle the deadlock using reentract lock.
public class Q2 {

    public static ReentrantLock reentrantLock1  = new ReentrantLock() ;
    public static ReentrantLock reentrantLock2  = new ReentrantLock() ;

    public static void main(String[] args) {


        final String res2 = "Him";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread() {
            public void run() {
                reentrantLock1.lock();

                    System.out.println("Thread 1: locked resource 1");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    reentrantLock2.lock();
                        System.out.println("Thread 1: locked resource 2");
                    reentrantLock2.unlock();
                reentrantLock1.unlock();

            }
        };

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                reentrantLock1.lock();


                    System.out.println("Thread 2: locked resource 2");

                    try { Thread.sleep(100);} catch (Exception e) {}

                   reentrantLock2.lock();
                        System.out.println("Thread 2: locked resource 1");
                    reentrantLock2.unlock();
                    reentrantLock1.unlock();

                }

        };


        t1.start();
        t2.start();
    }
}
