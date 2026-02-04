package Predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        String name1 = IO.readln("Enter the  first name : ");
        Predicate<String> p2 = name -> name.equalsIgnoreCase(name1);
        String name2 = IO.readln("Enter  the Second name : is ");
        IO.println("are the names are matching : " + p2.test(name2));

    }
}
