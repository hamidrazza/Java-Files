import java.util.*;
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,1,4,6,3,2,4,6,1};
        System.out.println(ans(arr));
    }

    public static int ans(int[] arr) {
        int unique = 0;
        for(int i = 0;i < arr.length;i++){
           unique = unique ^ arr[i];
        }
        return unique;
    }
}
