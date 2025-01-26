package abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        // Using super you can access final variables.
        super(age);
    }

    @Override
    void career()
    {
        System.out.println("I am going to be an engineer");
    }

    @Override
    void partner() {
        System.out.println("I Love Iron Man");
    }
}
