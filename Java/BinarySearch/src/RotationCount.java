import java.util.*;

// Rotation count in the Rotated Array.
public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int pivot = findPivot(arr);

        return pivot+1;
    }

    // Use this with non-duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    //This will work with duplicate values.
    static int findPivotwithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            // Skipping the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){

                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // Left side is sorted hence pivot is on the right side of the Array
            else if( arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end])){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
