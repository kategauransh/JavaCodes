package FunctionalInterface.FunctionalInterfaceDemo;

// interface Add {
//     void add(String b);
// }

// public class FunctionalInterface {

//     public static void main(String[] args) {
//         String a = "Gaurnsh";

//         Add add = (String b) -> System.out.println(b);
//         add.add(a);
//     }
// }
interface Add {
    int add(int b);
}

public class FunctionalInterfacedemo6 {

    public static void main(String[] args) {
        int a = 10;

        Add add = (int b) -> b;
        System.out.println(add.add(a));
    }
}