abstract class A {
    abstract void m1();
}

abstract class B extends A {
    void m1() {
        System.out.println("B m1");
    }
}

class C extends B {
}

public class Test {
    public static void main(String[] args) {
        C obj = new C();
        obj.m1();
    }
}