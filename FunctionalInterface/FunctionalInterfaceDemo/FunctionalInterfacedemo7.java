package FunctionalInterface.FunctionalInterfaceDemo;

@FunctionalInterface
interface Str {
    String str(String str);
}

public class FunctionalInterfacedemo7 {
    public static void main(String[] args) {
        Str nit = s -> "Gauransh" + s;
        System.out.println(nit.str(" Kate"));
    }
}
