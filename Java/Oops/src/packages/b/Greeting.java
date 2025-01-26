package packages.b;

import static packages.b.Message.message;

// Using packages we can create more than 1 class of the same name in diff packages.
public class Greeting {
    public static void main(String[] args) {
        System.out.println("I am awesome.");
        message();
    }
}
