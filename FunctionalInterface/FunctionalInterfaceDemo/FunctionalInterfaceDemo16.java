package FunctionalInterface.FunctionalInterfaceDemo;

@FunctionalInterface
interface Predictable {
    boolean verify(int num);
}

public class FunctionalInterfaceDemo16 {
    public static void main(String[] args) {
        Predictable p = (num) -> num % 2 == 0;

        int num1 = Integer.parseInt(IO.readln("Enter Your Number : "));
        boolean isEven = p.verify(num1);
        IO.println("The Number is Even : " + isEven);
    }
}
