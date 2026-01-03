public class Multithreading_CreatingThread {

    // Create a custom thread by extending the Thread class
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
        }
    }

    public static void main(String[] args) {
        // Create and start two threads
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        thread1.start(); // Start thread 1
        thread2.start(); // Start thread 2
    }
}