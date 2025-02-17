import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Restaurant{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tQty = 0, cQty = 0, sQty = 0, sdQty = 0, crQty = 0, tbQty = 0, obQty = 0;
        boolean repeat = true;
        double bill = 0;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm");
        String formattedDateTime = now.format(formatter);


        System.out.println("----------------------------------------------");
        System.out.println("           WELCOME TO TRY-FIRST CAFE         ");
        System.out.println("           DATE: " + formattedDateTime);
        System.out.println("----------------------------------------------");
        System.out.println("S.NO ||   ITEMS            || PRICE(In Rupees)");
        System.out.println("-----||--------------------||-----------------");
        System.out.println("1.   ||   Tea              || ₹15.00");
        System.out.println("2.   ||   Coffee           || ₹30.00");
        System.out.println("3.   ||   Samosa           || ₹10.00");
        System.out.println("4.   ||   Sandwich         || ₹25.00");
        System.out.println("5.   ||   Croissant        || ₹40.00");
        System.out.println("6.   ||   Toasted Bread    || ₹7.00");
        System.out.println("7.   ||   Osmania Biscuit  || ₹5.00");
        System.out.println("-----||--------------------||-----------------");
        System.out.println("0.   ||   ORDER DONE       || PRESS 0 ");
        System.out.println("-----||--------------------||-----------------");

        while (repeat) {
            System.out.print("Choose Item No : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Tea quantity: ");
                    tQty += sc.nextInt();
                    bill += tQty * 15;
                }
                case 2 -> {
                    System.out.print("Coffee quantity: ");
                    cQty = sc.nextInt();
                    bill += cQty * 30;
                }
                case 3 -> {
                    System.out.print("Samosa quantity: ");
                    sQty = sc.nextInt();
                    bill += sQty * 10;
                }
                case 4 -> {
                    System.out.print("Sandwich quantity: ");
                    sdQty = sc.nextInt();
                    bill += sdQty * 25;
                }
                case 5 -> {
                    System.out.print("Croissant quantity: ");
                    crQty = sc.nextInt();
                    bill += crQty * 45;

                }
                case 6 -> {
                    System.out.print("Toasted-bread quantity: ");
                    tbQty = sc.nextInt();
                    bill += tbQty * 7;
                }
                case 7 -> {
                    System.out.print("Osmania-biscuit quantity: ");
                    obQty = sc.nextInt();
                    bill += obQty * 5;
                }
                case 0 -> repeat = false;
                default -> System.out.println("Item No. is not available...!!");
            }
        }
        System.out.println("-----------------------");
        System.out.println("        YOUR BILL      ");
        System.out.println("-----------------------");
        if(tQty > 0){
            System.out.println("Tea X " + tQty + " = " + (tQty * 15));
        }
        if(cQty > 0){
            System.out.println("Coffee X " + cQty + " = " + (cQty * 30));
        }
        if(sQty > 0){
            System.out.println("Samosa X " + sQty + " = " + (sQty * 10));
        }
        if(sdQty > 0){
            System.out.println("Sandwich X " + sdQty + " = " + (sdQty * 25));
        }
        if(crQty > 0){
            System.out.println("Croissant X " + crQty + " = " + (crQty * 45));
        }
        if(tbQty > 0){
            System.out.println("Toasted Bread X " + tbQty + " = " + (tbQty * 7));
        }
        if(obQty > 0){
            System.out.println("Osmania Bis. X " + obQty + " = " + (obQty * 5));
        }
        double gst = bill * 0.05;
        System.out.println("Total : ₹" + bill);
        System.out.println("GST(5%) : ₹" + gst);
        double total = bill + gst;
        System.out.println("-----------------------");
        System.out.println("Grand Total : ₹" + total);
        System.out.println("-----------------------");
    }
}