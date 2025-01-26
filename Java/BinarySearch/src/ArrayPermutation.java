import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    static int[] buildArray(int[] arr){
        int[] ans = arr;

        for(int i = 0; i <= arr.length-1;i++){
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
