package interfaces.extendsDemo2;

// using 'implements' for the inheritance between class & interfaces.
public class Main implements B , A{
    @Override
    public void greet() {

    }

    @Override
    public void fun() {

    }

    public static void main(String[] args) {
        A.greeting();
    }
}
