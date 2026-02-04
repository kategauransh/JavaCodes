package FunctionalInterface.FunctionalInterfaceDemo;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo9 {
    public static void main(String[] args) {
        int a = Integer.parseInt(IO.readln("Enter a number"));
        Predicate<Integer> p = (num) -> num % 2 == 1;

        if (p.test(a)) {
            System.out.println("not even");
            // p.test(a);
        } else {
            System.out.println("even");
        }
    }

}