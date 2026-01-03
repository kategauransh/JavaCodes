import java.lang.Thread;

// Class that implements Runnable interface
class SimpleTask implements Runnable {
    // Method that contains the task to be performed
    @Override
    public void run() {
        System.out.println("Task is running in: " + Thread.currentThread().getName());
    }
}

public class Multithreading_RunnableExample {
    public static void main(String[] args) {
        // Creating a new thread with SimpleTask
        Thread thread1 = new Thread(new SimpleTask(), "Thread-1");
        Thread thread2 = new Thread(new SimpleTask(), "Thread-2");
        
        // Starting the threads
        thread1.start();
        thread2.start();
    }
}