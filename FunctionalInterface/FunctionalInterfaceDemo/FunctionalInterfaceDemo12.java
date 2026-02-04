package FunctionalInterface.FunctionalInterfaceDemo;

@FunctionalInterface
interface calculator {
    void sum(int a, int b);
}

public class FunctionalInterfaceDemo12 {
    public static void main(String[] args) {

        calculator cc = (c, d) -> System.out.println(c + d);
        int num1 = Integer.parseInt(IO.readln("Enter first number :"));
        int num2 = Integer.parseInt(IO.readln("Enter second number :"));
        cc.sum(num1, num2);
    }
}