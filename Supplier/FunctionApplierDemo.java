package Supplier;

import java.util.function.Consumer;

public class FunctionApplierDemo {
    public static void main(String[] args) {
        int no = Integer.parseInt(IO.readln("Enter a number: "));
        IO.println("Original value: " + no);
        Consumer<Integer> c1 = num1 -> IO.println("After adding 5: " + (num1 + 5));
        c1.accept(no);
        Consumer<Integer> c2 = num2 -> IO.println("After multiplying by 2: " + (num2 * 2));
        c2.accept(no);
        Consumer<Integer> c3 = num3 -> IO.println("After subtracting 3: " + (num3 - 3));
        c3.accept(no);
    }
}
