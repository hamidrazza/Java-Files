package properties.polymorphism;

public class Circle extends Shapes{

    // This will run when any object of circle is being created
    // Hence it is overriding the parent method.
    @Override // This is called annotation
    void area(){
        System.out.println("Area of circle is = pie * r * r");
    }
}
