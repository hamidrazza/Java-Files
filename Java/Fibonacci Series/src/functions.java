import java.util.Scanner;
public class functions {
    public static void main(String[] args) {
        //Q. Take input fo 2 numbers and print the sum
//        Scanner in = new Scanner(System.in);
//        int num1,num2,sum;

        //This is in a simple way
        /*System.out.print("Enter the first number : ");
        num1 = in.nextInt();

        System.out.print("Enter the second number : ");
        num2 = in.nextInt();

        sum = num1+num2;
        System.out.println("The sum of both numbers is : "+sum);*/

        //Calling function method
        //sum();
//        int ans = sum2();
//        System.out.println("The addition is : " + ans);

        int ans = sum3(20,10); //Here a: and b: is a IntelliJ Idea feature not a part of code.
        System.out.println(ans);

    }
    //Using function method
   static void sum(){ //Here no values are going to be return, so we use "void"
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter the number 1 : ");
        num1 = in.nextInt();

        System.out.print("Enter the number 2 : ");
        num2 = in.nextInt();

        sum = num1+num2;
        System.out.println("The sum of both numbers is : "+sum);
    }
    static int sum2(){ //Here integer value is going to be return, so we use "int"
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter the number 1 : ");
        num1 = in.nextInt();

        System.out.print("Enter the number 2 : ");
        num2 = in.nextInt();

        sum = num1+num2;
        return sum;
    }

    //Passing the values of numbers while we are calling the function method in main()
    static int sum3(int a,int b){
        int sum = a+b;
        return sum;
    }

}
