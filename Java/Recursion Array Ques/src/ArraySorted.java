// Check whether array is sorted or not.
public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int[] arr, int index){
        // Base Condition
        if(index == arr.length-1){
            return true;
        }
        return (arr[index] < arr[index+1]) && isSorted(arr, index+1);
    }
}
