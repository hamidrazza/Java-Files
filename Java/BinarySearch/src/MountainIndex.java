//Question Link :
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class MountainIndex {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};

    }

    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public int peakIndexInMountainArray(int[] arr) {
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
}
