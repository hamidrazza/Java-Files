import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,8,10,22,34,45,78,88,90};
        int target = 10;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){

            int mid = start + (end - start) /2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
