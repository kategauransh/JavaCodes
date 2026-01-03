public class SimpleThreadExample {
    public static void main(String[] args) {
        // Create a new thread
        Thread myThread = new Thread(new MyRunnable());
        
        // Start the thread
        myThread.start();
        
        // Print message from the main thread
        System.out.println("Hello from the main thread!");
    }
}

// A class that implements Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code to be executed in the new thread
        System.out.println("Hello from the new thread!");
    }
}