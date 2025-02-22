import java.util.Scanner;

public class Bank {
    // Making this program like the Banking system.

    static double balance = 2000;


    public static void main(String[] args) {
        boolean repeat = true;
        Scanner in = new Scanner(System.in);

        System.out.println("+-----------------------+");
        System.out.println("|   WELCOME TO THE BANK |");
        System.out.println("+-----------------------+");
        System.out.println("|   1. CHECK BALANCE    |");
        System.out.println("|   2. WITHDRAW         |");
        System.out.println("|   3. DEPOSIT          |");
        System.out.println("|   0. EXIT             |");
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
        System.out.println("THANKS FOR VISITING, VISIT AGAIN !!!");
        in.close();
    }

    public static void checkVal() {
        System.out.println("Your balance is ₹"+balance);
    }

    public static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        double amount = sc.nextDouble();
        if(amount > balance){
            System.out.println("Insufficient Balance !!");
        }
        else if(amount > 50000){
            System.out.println("To withdraw 50000 or more than 50000");
            System.out.print("You need to enter PAN NO : ");
            String panNo = sc.next();
            if(panNo.length() == 10){
                System.out.println("PAN NO VERIFIED !!");
            }
            System.out.println("WITHDRAW SUCCESSFUL !!!");
            balance -= amount;
            System.out.println("Your current balance is : " + (balance-amount));
        }
        else{
            System.out.println("WITHDRAW SUCCESSFUL !!!");
            balance -= amount;
            System.out.println("Your current balance is : " + (balance));
        }
    }

    public static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        double amount = sc.nextDouble();
        if(amount > 50000){
            System.out.println("To Deposit 50000 or more than 50000");
            System.out.print("You need to enter PAN NO : ");
            String panNo = sc.next();
            if(panNo.length() == 10){
                System.out.println("PAN NO VERIFIED !!");
            }
            System.out.println("DEPOSIT SUCCESSFUL !!!");
            balance += amount;
            System.out.println("Your current balance is : " + (balance));
        }
        else{
            System.out.println("DEPOSIT SUCCESSFUL !!!");
            balance += amount;
            System.out.println("Your current balance is : " + (balance));
        }
    }
}
