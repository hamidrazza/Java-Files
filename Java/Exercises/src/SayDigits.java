import java.util.*;
public class SayDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any digits : ");

        int num = in.nextInt();
        digits(num);
    }

    private static void digits(int num) {
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int new_num = 0;
        while(num != 0){
            int digit = num % 10;
            new_num = (new_num * 10) + digit;
            num /= 10;
        }
        while(new_num != 0){
            int digit = new_num % 10;
            System.out.print(arr[digit]+ " ");
            new_num /= 10;
        }
    }
}
