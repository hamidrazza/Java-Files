import java.util.Scanner;
public class occurances {
    public static void main(String[] args) {
        System.out.print("Enter any number : ");
        Scanner in = new Scanner(System.in);
        int key = 5,count = 0;
        int num = in.nextInt();
        while(num>0){
            int rem = num % 10;
            if (rem == key){
                count++;
            }
            num /= 10;
        }
        System.out.println("The occurrence of 5 in this number is : "+count);
    }
}
