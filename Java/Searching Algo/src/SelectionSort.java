import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,-23,-2,0,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr,0,last);
            swap(arr,last,maxIndex);
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static int getMax(int[] arr, int start, int last){
        int max = start;
        for (int i = start; i <= last; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
