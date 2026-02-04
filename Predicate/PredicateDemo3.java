package Predicate;

import java.util.function.Predicate;

public class PredicateDemo3 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = i -> i % 3 == 0;
        Predicate<Integer> p3 = i -> i % 5 == 0;
        Predicate<Integer> p4 = p1.and(p2);
        Predicate<Integer> p5 = p1.or(p2);
        Predicate<Integer> p6 = p1.negate();
        IO.println("p1.test(10) : " + p1.test(10));
        IO.println("p2.test(10) : " + p2.test(10));
        IO.println("p3.test(10) : " + p3.test(10));
        IO.println("p4.test(6) : " + p4.test(6));
        IO.println("p5.test(6) : " + p5.test(6));
        IO.println("p6.test(6) : " + p6.test(6));

    
    }
}