package FunctionalInterface.FunctionalInterfaceDemo;

@FunctionalInterface
interface printable {
    void print();
}

public class FunctionalInterfaceDemo10 {
    void main() {
        printable p = () -> System.out.println("Hello, it's Printable");
        p.print();
    }
}