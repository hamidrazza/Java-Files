import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = in.nextInt();
        findOdd(num);
    }
    public static void findOdd(int num){
        if((num&1) == 1){
            System.out.print(num + " is Odd.");
        }
        else{
            System.out.print(num + " is Even.");
        }
    }
}
