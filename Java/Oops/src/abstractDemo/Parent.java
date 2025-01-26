package abstractDemo;

public abstract class Parent {

    // You can't create objects of an abstract class.
    // And similarly you can't create abstract constructor
    // You can't make 'final abstract' class because it needs to be overridden

    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        this.VALUE = 135488;
    }
    /*
     You can't create abstract static method because both are opposite
     Abstract--> needs to be overridden
     static --> can't be overridden
     But you can create static methods
    */

    static void hello(){
        System.out.println("Heyyy...");
    }


    abstract void career();
    abstract void partner();
}
