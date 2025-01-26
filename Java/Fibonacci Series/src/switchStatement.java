import java.util.Scanner;
public class switchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        /*if (fruit.equals("Mango")){ //fruit.equal is equals to fruit == "Mango"
            //fruit.equals only checks the value.
            System.out.println("King of the Fruits.");
        }
        if (fruit.equals("apple")){
            System.out.println("A red sweet fruit.");
        }*/

        // Switch Statement
        switch (fruit) {
            case "Mango" -> System.out.println("King of the Fruits.");
            case "Apple" -> System.out.println("A sweet red Fruit.");
            case "Orange" -> System.out.println("A round Fruit");
            case "Grapes" -> System.out.println("A small Fruit");
            default -> System.out.println("Please enter a valid Fruit name!!");
        }
    }
}
