package FunctionalInterface.FunctionalInterfaceDemo;
// interface Course {

//     String courseName();

//     String facultyName();

//     String duration();
// }

// @FunctionalInterface
// interface NIT extends Course {
//     String nit(String courseName);
// }

// public class FunctionalInterfacedemo5 {
//     public static void main(String[] args) {
//         NIT nit = (String course) -> course;
//         System.out.println(nit.nit("Java"));
//     }
// }
// @FunctionalInterface 
interface Str {
    String str(String str);
}

public class FunctionalInterfacedemo5 {
    public static void main(String[] args) {
        Str nit = s -> "Naresh" + s;
        System.out.println(nit.str("IT"));
    }
}