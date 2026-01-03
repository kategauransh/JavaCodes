public class MultithreadingExample extends Thread {
    public void run() {
        // Displaying a message from each thread
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    }

    public static void main(String[] args) {
        // Creating and starting two threads
        MultithreadingExample thread1 = new MultithreadingExample();
        MultithreadingExample thread2 = new MultithreadingExample();
        
        thread1.start(); // Starting thread 1
        thread2.start(); // Starting thread 2
    }
}