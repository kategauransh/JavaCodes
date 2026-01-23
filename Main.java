interface Payment {
    void pay(int amount);
}

class UpiPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment();
        p1.pay(500);

        Payment p2 = new CardPayment();
        p2.pay(1000);
    }
}
