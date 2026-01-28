public class Multithreading_CreatingThread extends Thread {
    // Override the run method to define the task for the thread
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " - Count: " + i);
            try {
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create two thread instances
        Multithreading_CreatingThread thread1 = new Multithreading_CreatingThread();
        Multithreading_CreatingThread thread2 = new Multithreading_CreatingThread();

        // Start both threads
        thread1.start();
        thread2.start();
    }
}