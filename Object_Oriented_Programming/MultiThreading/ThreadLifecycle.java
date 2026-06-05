/**
 * GFG Thread life cycle = https://www.geeksforgeeks.org/java/lifecycle-and-states-of-a-thread-in-java/
 * 
 * Link to thread lifecycle flowchart
 * https://media.geeksforgeeks.org/wp-content/uploads/20240318155846/Lifecycle-and-States-of-a-Thread-in-Java-1.png
*/
class MyThread extends Thread {
    public void run() {
        System.out.println("Inside run() state = " 
            + Thread.currentThread().getState()); // RUNNABLE
        try {
            Thread.sleep(500); // goes to TIMED_WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifecycle {
    public static void main(String[] args) throws Exception {

        MyThread t1 = new MyThread();

        System.out.println("After new    = " + t1.getState()); // NEW

        t1.start();
        System.out.println("After start  = " + t1.getState()); // RUNNABLE

        Thread.sleep(100); // let t1 reach sleep()
        System.out.println("While sleep  = " + t1.getState()); // TIMED_WAITING

        t1.join(); // wait for t1 to finish
        System.out.println("After finish = " + t1.getState()); // TERMINATED
    }
}