public class MultithreadingExample {
    public static void main(String[] args) {
        // Create a new thread to run a task
        Thread myThread = new Thread(new Task());
        myThread.start(); // Start the thread
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        // Task that will run in a separate thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}