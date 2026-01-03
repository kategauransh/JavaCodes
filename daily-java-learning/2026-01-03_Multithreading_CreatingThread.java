import java.lang.Thread;

// Class that extends Thread
class MyThread extends Thread {
    // Run method defines the thread's task
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
            try {
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class to test the thread
public class Multithreading_CreatingThread {
    public static void main(String[] args) {
        // Create two threads
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        // Start the threads
        thread1.start();
        thread2.start();
    }
}