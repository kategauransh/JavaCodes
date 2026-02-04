package FunctionalInterface.FunctionalInterfaceDemo;

class Box<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class TypeParameterDemo1 {
    public static void main(String[] args) {

        Box<Integer> b1 = new Box<Integer>(10);
        IO.println("Data is : " + b1.getData());

        Box<String> b2 = new Box<String>("Gauransh kate");
        IO.println("Data is : " + b2.getData());
    }
}