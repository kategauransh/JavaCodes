public class Multithreading_CreatingThread extends Thread {
    // Override the run method to define the thread's task
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                // Pause for a moment to simulate work
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create a new thread
        Multithreading_CreatingThread myThread = new Multithreading_CreatingThread();
        // Start the thread
        myThread.start();
    }
}