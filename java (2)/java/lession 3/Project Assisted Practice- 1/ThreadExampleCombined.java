class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " (Thread) Value " + i);
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " (Runnable) Value " + i);
        }
    }
}

public class ThreadExampleCombined {
    public static void main(String args[]) {
        // Creating a thread by extending Thread class
        MyThread t1 = new MyThread();
        t1.start();

        // Creating a thread by implementing Runnable interface
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
