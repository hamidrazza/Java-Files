package interfaces.extendsDemo2;

public interface A {

    // Using default value will give all the extended class a default value.
    // But if you implement more than 1 interface don't give default values in all the interfaces.

    default void fun(){
        System.out.println("I am in 'A' interface");
    }


    // static interface methods should always have a body
    // call via the interface name.
    static void greeting(){
        System.out.println("Heyy... I'm in static method.");
    }
}
