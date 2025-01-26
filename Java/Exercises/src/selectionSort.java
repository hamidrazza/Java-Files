import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {43,2, -32,-12,12,9,0,};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for (int i = 0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxValue = max(arr,0,last);
            swap(arr,maxValue,last);
        }
    }
    static int max(int[] arr,int first,int last){
        int maxIndex = first;
        for (int i = first;i<= last; i++){
            if (arr[maxIndex] < arr[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    static void swap(int[] arr,int max,int last){
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
    }
}