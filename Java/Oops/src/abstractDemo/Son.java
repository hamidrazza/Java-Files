package abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        // Using super you can access final variables.
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I Love Pepper Potts");
    }
}
