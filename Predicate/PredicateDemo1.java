package Predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = age -> age >= 18;
        int num = Integer.parseInt(IO.readln("Enter the age : "));
        System.out.println("Age is Greater than 18 : " + p1.test(num));

    }

}
