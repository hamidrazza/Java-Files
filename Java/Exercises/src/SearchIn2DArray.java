import java.util.*;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {12,3,22,13},
            {45,55},
            {14,23,81},
            {48,33,55,64}
        };
//        int target = 11;
//        int[] ans = search(arr,target);
//        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0 ; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Finding the maximum value in 2D Array
    // You can also use the enhanced form of for-loop
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row : arr){
            for(int element : row){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
