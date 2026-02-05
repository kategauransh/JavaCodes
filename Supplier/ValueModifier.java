package Supplier;

import java.util.function.Consumer;

public class ValueModifier {
    void main() {
        int num = Integer.parseInt(IO.readln("Enter a number: "));
        IO.println("Original value: " + num);

        Consumer<Integer> c1 = num1 -> IO.println("After doubling the value: " + (num1 * 2));
        c1.accept(num);
        Consumer<Integer> c2 = num2 -> IO.println("After incrementing the value by 3: " + (num2 + 3));
        c2.accept(num);
        Consumer<Integer> c3 = num3 -> IO.println("After squaring the value: " + (num3 * num3));
        c3.accept(num);

    }
}