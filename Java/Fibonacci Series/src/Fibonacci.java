import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the index to find the Fibonacci No : ");
        int n = in.nextInt();

        int p = 0;
        int i = 1;
        int count = 2;

        while (count <= n){
            int temp = i;
            i = i+p;
            p = temp;
            count++;
        }
        System.out.println("The " + n + "th Fibonacci No is : " + i);

    }
}
