public class MultithreadingExample extends Thread {
    // Method to define the task that the thread will execute
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
    }

    public static void main(String[] args) {
        // Creating and starting multiple threads
        MultithreadingExample thread1 = new MultithreadingExample();
        MultithreadingExample thread2 = new MultithreadingExample();

        thread1.start(); // Starting thread 1
        thread2.start(); // Starting thread 2
    }
}