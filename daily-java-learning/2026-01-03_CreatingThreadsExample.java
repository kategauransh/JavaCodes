public class CreatingThreadsExample extends Thread {
    @Override
    public void run() {
        // This method is executed when the thread is started
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
    }

    public static void main(String[] args) {
        // Create and start two threads
        CreatingThreadsExample thread1 = new CreatingThreadsExample();
        CreatingThreadsExample thread2 = new CreatingThreadsExample();
        
        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}