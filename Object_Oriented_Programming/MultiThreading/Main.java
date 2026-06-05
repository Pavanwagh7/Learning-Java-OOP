public class Main {
    public static void main(String[] args) {

        //Way 01 (Runnable)
        SumThread s = new SumThread(12,3);
        ProductThread p = new ProductThread(3,4);

        Thread t1 = new Thread (s);
        Thread t2 = new Thread (p);

        t1.start ();
        t2.start ();

        // //Way 02 (Using MyThread class extends Thread)
        // MyThread t1 = new MyThread();
        // MyThread t2 = new MyThread();
        // MyThread t3 = new MyThread();
        // t1.start();
        // t2.start();
        // t3.start();
        

    }
}
