package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle cir = new Circle();

        // This will run the Shapes's area method
        Shapes tri = new Triangle();

        cir.area();
    }
}
