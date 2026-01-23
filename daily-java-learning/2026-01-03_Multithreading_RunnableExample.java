public class Multithreading_RunnableExample implements Runnable {
    // The run method to be executed in a new thread
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // Create a new thread using the Runnable interface
        Multithreading_RunnableExample runnableExample = new Multithreading_RunnableExample();
        Thread thread1 = new Thread(runnableExample);
        Thread thread2 = new Thread(runnableExample);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}