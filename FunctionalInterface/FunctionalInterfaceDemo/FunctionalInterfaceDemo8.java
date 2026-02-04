package FunctionalInterface.FunctionalInterfaceDemo;

interface NIT {
    public void nit();
}

public class FunctionalInterfaceDemo8 {
    public static void main(String[] args) {
        String str = "IT";

        NIT n = () -> {
            System.out.println("Naresh" + str);
        };
        n.nit();
    }
}