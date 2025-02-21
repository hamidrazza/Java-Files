import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Electricity {
    // Electricity bill for Domestic and Commercial use
    static double bill = 0;
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm");
        String timeDate = now.format(formatter);

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("     ELECTRICITY BILL ");
        System.out.println("     Date: " + timeDate);
        System.out.println("-------------------------");
        System.out.println("1. Domestic Electric Bill");
        System.out.println("2. Commercial Electric Bill");
        System.out.print("Enter your choice : ");
        int input = sc.nextInt();

        switch(input){
            case 1 -> {
                System.out.print("Enter your consumption(in Kwh) : ");
                double digit = sc.nextDouble();
                System.out.println("Your bill is : ₹" + String.format("%.2f",domesticBill(digit)));
            }
            case 2 -> {
                System.out.print("Enter your consumption(in Kwh) : ");
                double digit = sc.nextDouble();
                System.out.println("Your bill is : ₹" + String.format("%.2f",commercialBill(digit)));
            }
        }
    }

    static double domesticBill(double usage){
        if(usage < 100 && usage >= 0){
            return bill += (usage * 3.10);
        }
        else if(usage >= 100 && usage <= 200){
            return bill += (usage * 4.60);
        }
        else if(usage < 0) {
            System.out.println("Consumption can't be in negative.");
        }
        return bill += (usage * 5.50);
    }
    static double commercialBill(double usage){
        if(usage < 100 && usage >= 0){
            return bill += (usage * 8.50);
        }
        else if(usage >= 100 && usage <= 200){
            return bill += (usage * 9.90);
        }
        else if(usage < 0) {
            System.out.println("Consumption can't be in negative.");
        }
        return bill += (usage * 10.40);

    }
}