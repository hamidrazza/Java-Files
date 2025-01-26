import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {3,5,2,2,6};
        int ans = sum(arr);
        System.out.println("Sum of your array is : " + ans);
    }
    public static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return arr[arr.length-1]+sum(Arrays.copyOfRange(arr,0,arr.length-1));
    }
}