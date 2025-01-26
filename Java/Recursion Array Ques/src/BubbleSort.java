import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,54,2,1,55};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int length, int index){
        if(length == 0){
            return;
        }
        if(index < length){
            if(arr[index] > arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            sort(arr,length,index+1);
        }else{
            sort(arr,length-1,0);
        }
    }
}
