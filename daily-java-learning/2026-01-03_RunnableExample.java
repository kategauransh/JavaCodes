public class RunnableExample implements Runnable {
    @Override
    public void run() {
        // This method contains the code that runs in a new thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Running in thread: " + Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        // Create a new thread for the Runnable task
        Thread thread = new Thread(new RunnableExample());
        thread.start(); // Start the new thread
    }
}