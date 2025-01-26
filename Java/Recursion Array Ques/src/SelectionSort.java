import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int length, int index, int max){
        if(length == 0){
            return;
        }
        if(index < length){
            if(arr[index] > arr[max]){
                sort(arr, length,index+1,index);
            }else{
                sort(arr,length,index+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[length-1];
            arr[length-1] = temp;
            sort(arr,length-1,0,0);
        }
    }
}
