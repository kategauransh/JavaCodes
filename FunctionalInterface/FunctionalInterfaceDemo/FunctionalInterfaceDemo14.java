package FunctionalInterface.FunctionalInterfaceDemo;

@FunctionalInterface
interface shape {
    void draw();
}

public class FunctionalInterfaceDemo14 {
    public static void main(String[] args) {
        shape s = () -> System.out.println("Drawing the Shape");
        s.draw();
    }
}
