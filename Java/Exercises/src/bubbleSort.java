import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++){
            boolean swapped = false; // for check array is already sorted or not.
            for (int j = 1;j<arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swapped = true;
                }
            }
            if (!swapped){
                break; // break, if no swapping is occurred for a particular (i) loop value;
            }
        }
    }
}