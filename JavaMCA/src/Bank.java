import java.util.Scanner;

public class Bank {
    // Making this program like the Banking system.

    static double balance;

    public static void main(String[] args) {
        boolean repeat = true;
        Scanner in = new Scanner(System.in);

        System.out.println("+-----------------------+");
        System.out.println("|   WELCOME TO THE BANK |");
        System.out.println("+-----------------------+");
        System.out.println("|1. CHECK BALANCE       |");
        System.out.println("|2. WITHDRAW            |");
        System.out.println("|3. DEPOSIT             |");
        System.out.println("|0. EXIT                |");
        System.out.println("+-----------------------+");

        while (repeat) {
            System.out.print("Enter an option : ");
            int choice = in.nextInt();

            switch (choice) {
                case 0 -> {
                    repeat = false;
                    break;
                }
                case 1 -> {
                    checkVal();
                    break;
                }
                case 2 -> {
                    withdraw();
                    break;
                }
                case 3 -> {
                    deposit();
                    break;
                }

                default -> System.out.println("INVALID OPTION !!");
            }
        }
        in.close();
    }

    public static void checkVal() {

    }

    public static void withdraw() {

    }

    public static void deposit() {

    }
}
