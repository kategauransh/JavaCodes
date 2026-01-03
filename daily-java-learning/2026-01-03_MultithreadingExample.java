public class MultithreadingExample extends Thread {
    // Method that defines the task to be run in a new thread
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " - Count: " + i);
            try {
                // Sleep for a short duration to simulate work
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create two thread instances
        MultithreadingExample thread1 = new MultithreadingExample();
        MultithreadingExample thread2 = new MultithreadingExample();
        
        // Start both threads
        thread1.start();
        thread2.start();
    }
}