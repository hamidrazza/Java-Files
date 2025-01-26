package staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    // You can initialize using Static-Block
    // It will only run once, when the first object is created i.e. when the class is loaded for the first time.
    static{
        System.out.println("I am in Static Block");
        b = a * 5;
    }

    public static void main(String[] args) {
        // Making an obj for static
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3; // b = 20 + 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        // Here static doesn't run again and don't show us the 'println' line.
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
