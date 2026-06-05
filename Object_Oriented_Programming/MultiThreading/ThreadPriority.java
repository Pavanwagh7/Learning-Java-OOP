/**
    No object needed — called on class directly
        Thread.currentThread().getName();
        Thread.currentThread().getPriority();
        Thread.currentThread().getState();

    Thread.currentThread() method ,What it does ? 
        javaThread t = Thread.currentThread();
    It returns a reference to the thread that 
    is currently executing — whichever thread 
    calls this method, it returns that thread's object.
*/


/**
    Thread priority in Java is non-deterministic.
    Higher priority increases the probability of 
    runningfirst — it does not guarantee it.
*/
class MyThread1 implements Runnable {
    public void run () {
        System.out.println("in run() method : Thread Name : " + Thread.currentThread().getName() + ", thread priority = " + Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread1 obj2 = new MyThread1();
        MyThread1 obj3 = new MyThread1();
        

        Thread t1 = new Thread (obj1);
        t1.setName("Thread01");
        t1.setPriority(Thread.MIN_PRIORITY);

        Thread t2 = new Thread (obj2);
        t2.setName("Thread02");
        t2.setPriority(Thread.NORM_PRIORITY);

        Thread t3 = new Thread (obj3);
        t3.setName("Thread03");
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

