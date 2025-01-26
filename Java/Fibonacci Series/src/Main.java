import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number to find the Fibonacci Series : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
//        while(n > 2){
//            int temp = a; // 0
//            b = temp + b; // 0 + 1 = 1
//
//            n--;
//
//        }
        for (int i = 2;i <= n;i++){
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(b);
    }
}