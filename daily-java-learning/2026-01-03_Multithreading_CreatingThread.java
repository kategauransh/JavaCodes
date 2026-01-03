public class Multithreading_CreatingThread {

    // This class extends Thread to create a new thread
    static class MyThread extends Thread {
        public void run() {
            // Code that runs in the new thread
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread " + this.getName() + " - Count: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create and start two threads
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        thread1.start(); // Start thread1
        thread2.start(); // Start thread2
    }
}