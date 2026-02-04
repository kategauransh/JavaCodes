package FunctionalInterface.FunctionalInterfaceDemo;

interface Length {
    int getLength(String s);
}

public class FunctionalInterfaceDemo13 {
    public static void main(String[] args) {
        Length length = str -> {
            return str.length();
        };
        String Str = IO.readln("Enter Your City Name : ");
        IO.println("Length of Your city name is :  " + length.getLength(Str));
    }
}
