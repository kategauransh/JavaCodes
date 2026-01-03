import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks to the pool
        for (int i = 0; i < 5; i++) {
            executor.submit(new Task("Task " + (i + 1)));
        }

        // Shut down the executor
        executor.shutdown();
    }
}

// A simple task that implements Runnable
class Task implements Runnable {
    private String taskName;

    public Task(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        System.out.println(taskName + " is running on " + Thread.currentThread().getName());
    }
}