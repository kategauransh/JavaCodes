abstract class A1 {
    abstract void show();

    void display() {
        System.out.println("Display in A1");
    }
}

abstract class B1 extends A1 {
    void display() {
        System.out.println("Display in B1");
    }
}

class C1 extends B1 {
    void show() {
        System.out.println("Show in C1");
    }
}

public class Test1 {
    public static void main(String[] args) {
        A1 obj = new C1();
        obj.display();
        obj.show();
    }
}