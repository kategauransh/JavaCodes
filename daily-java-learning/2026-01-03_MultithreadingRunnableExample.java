public class MultithreadingRunnableExample implements Runnable {
    @Override
    public void run() {
        // Code that defines the task to be executed
        System.out.println("Task is running in thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // Create an instance of the runnable task
        MultithreadingRunnableExample task = new MultithreadingRunnableExample();

        // Create two threads that will execute the task
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        // Start both threads
        thread1.start();
        thread2.start();
    }
}