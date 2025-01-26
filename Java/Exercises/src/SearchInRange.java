import java.util.*;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,44,21,34,77,32,76};
        int target= 21;
        System.out.println(search(arr,target,1,5));
    }
    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = start;index <= end;index++){

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
