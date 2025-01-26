package singletonClass;

public class Main {
    public static void main(String[] args) {
        // Every it creates, it's pointing to the same object.
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // Here, all the three reference variables are pointing to just one object.
    }
}
