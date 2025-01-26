import java.util.*;
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {12,53,55,22,5,7,-12,42};
        int target = 22;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    // Search the element if found return the index otherwise return -1;
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0;index < arr.length;index++){

            int element = arr[index];

            if(element == target){
                return index;
            }
        }
        // This line will execute if no one above return statement will execute
        // Hence target not found
        return -1;
    }
}
