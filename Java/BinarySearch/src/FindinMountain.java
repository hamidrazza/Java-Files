import java.util.*;

public class FindinMountain {
    public static void main(String[] args) {

    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        // If not available then search in the second half of the array.

        return orderAgnosticBS(arr,target,peak+1,arr.length-1);

    }

    static public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid+1]){
                // That means you are in the decreasing part of the array.
                // Because if (mid+1) is less, than we don't need to check
                end = mid;
            }
            else{
                //Because if
                start = mid+1;
            }
        }
        // return start OR end is equal because there are pointing to the same element.
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start+(end-start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if (target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
