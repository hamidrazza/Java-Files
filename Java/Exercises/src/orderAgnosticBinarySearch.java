public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {87,75,73,65,55,49,42,37,30,20,18};
        int target = 42;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
//    Work on both Ascending and Descending order Arrays
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

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
