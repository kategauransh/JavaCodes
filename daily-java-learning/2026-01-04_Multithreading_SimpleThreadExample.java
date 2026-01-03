public class SimpleThreadExample extends Thread {
    // Overriding the run method to define thread behavior
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        SimpleThreadExample thread1 = new SimpleThreadExample(); // Create thread 1
        SimpleThreadExample thread2 = new SimpleThreadExample(); // Create thread 2

        thread1.start(); // Start thread 1
        thread2.start(); // Start thread 2
    }
}