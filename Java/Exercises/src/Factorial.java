import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();

        int ans = fact(num);
        System.out.println(ans);

    }
    public static int fact(int num){
        if(num == 0){
            return 1;
        }
        return num * fact(num-1);
    }
}
