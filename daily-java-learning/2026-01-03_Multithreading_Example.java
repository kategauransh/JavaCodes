public class MultithreadingExample extends Thread {
    // Method to run when the thread starts
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
    }

    public static void main(String[] args) {
        // Create two threads
        MultithreadingExample thread1 = new MultithreadingExample();
        MultithreadingExample thread2 = new MultithreadingExample();
        
        // Start the threads
        thread1.start();
        thread2.start();
    }
}