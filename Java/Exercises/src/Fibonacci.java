import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter series of number : ");

        int num = in.nextInt();
        int ans = fibo(num);
        System.out.print(ans);
    }

    static int fibo(int num) {
        //Base Case
        if (num == 0 || num == 1){
            return num;
        }

        return fibo(num-1)+fibo(num-2);

    }
}
