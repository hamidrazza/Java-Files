import java.util.Scanner;

public class findPercentage {
    public static void main(String[] args){
        System.out.println("Enter your marks according to your subject name.");
        Scanner in = new Scanner(System.in);
        int sum = 0, total = 500;
        for (int i = 1; i <= 5; i++){
            System.out.print("Enter the marks of Subject "+ i + " : ");
            int marks= in.nextInt();
            sum += marks;
        }
        float percentage = (sum/500f)*100;
        System.out.println("Your percentage is " + percentage + "%");
    }
}
