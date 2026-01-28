public class Multithreading_CreatingThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running!");
    }

    public static void main(String[] args) {
        // Create a new thread
        Multithreading_CreatingThread thread = new Multithreading_CreatingThread();
        // Start the thread
        thread.start();
    }
}