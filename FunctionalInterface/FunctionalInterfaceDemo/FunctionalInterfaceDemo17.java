package FunctionalInterface.FunctionalInterfaceDemo;

@FunctionalInterface
interface Predictable1 {
    boolean verify(int num);
}

public class FunctionalInterfaceDemo17 {
    public static void main(String[] args) {
        Predictable1 p = (num) -> {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int num1 = Integer.parseInt(IO.readln("Enter Your Number : "));
        boolean isPrime = p.verify(num1);
        IO.println("The Number is Prime : " + isPrime);
    }
}