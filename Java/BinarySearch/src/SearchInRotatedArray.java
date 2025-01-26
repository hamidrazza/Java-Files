
// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1208913499/
public class SearchInRotatedArray {
    public static void main(String[] args) {
    int[] arr = {3,5,1};
    System.out.println(search(arr,3));

    int[] dupArr = {2,9,2,2,2};
    System.out.println();
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // If pivot not found in the array
        if(pivot == -1){
            // That means array is not rotated Array
            // Hence do normal binary search
            return binarySearch(nums,target, 0,nums.length-1);
        }
        // If pivot found in the array
        // That means we have 2 ascending sorted array

        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        else{
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }

    //This will not work with duplicate values.
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
    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end-start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
