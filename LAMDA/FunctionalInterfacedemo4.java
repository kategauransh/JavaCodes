interface Runnable {
    void run();
}

public class FunctionalInterfacedemo4 {
    public static void main(String[] args) {
        Runnable nit = () -> System.out.println("Thread Started");
        nit.run();
    }
}