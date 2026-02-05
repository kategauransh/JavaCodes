package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerat {
    public static void main(String[] args) {
        Random random = new Random();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmno pqrstuvwxyz";
        String digit = "01234567 89";
        String special = "@#$%!&*";
        String charSet = upper + lower + digit + special;

        Supplier<String> s1 = () -> {
            String result = "";
            for (int i = 0; i < 8; i++) {
                int x = random.nextInt(charSet.length());
                result += charSet.charAt(x);
            }
            return result;
        };
        IO.println(s1.get());
    }
}
