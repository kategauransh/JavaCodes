class MyThread extends Thread {
    // Override the run method to define the task of the thread
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        // Create and start multiple threads
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}