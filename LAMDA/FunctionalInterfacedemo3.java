// interface Add1 {
//     int add(int b);
//     int add(int a, int b);
// }

// public class FunctionalInterfacedemo3 {
//     public static void main(String[] args) {
//         int a = 21;
//         Add1 add = b -> b + b;
//         System.out.println(add.add(a));
//     }
interface Drawable {
    void draw();
}

public class FunctionalInterfacedemo3 {
    public static void main(String[] args) {
        Drawable d = () -> System.out.println("Drawing...");
        d.draw();

    }
}
// }
