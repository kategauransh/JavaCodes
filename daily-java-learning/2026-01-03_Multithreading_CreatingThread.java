public class Multithreading_CreatingThread {
    public static void main(String[] args) {
        // Create a new thread using the Thread class
        Thread myThread = new Thread(new MyRunnable());
        
        // Start the thread
        myThread.start();
        
        // Print a message from the main thread
        System.out.println("Main thread is executing.");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        // This code will run in the new thread
        System.out.println("New thread is executing.");
    }
}