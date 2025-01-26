import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;

            // For the every i and sorting we got the largest element at the end.
            // Hence, sort N-i times.
            for (int j = 1; j < arr.length-i; j++) {
                // If index j is less then j-1 swap the element.
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if j does not swap any element hence we know that array is sorted.
            if(!swapped){
                break;
            }
        }
    }
}
