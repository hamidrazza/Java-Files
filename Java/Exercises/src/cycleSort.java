import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        System.out.println("Cyclic Sort");
        int[] arr = {6,1,4,3,5,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Cyclic Sort used to sort the array from [1 to N]
    static void sort(int[] arr){
        for (int i = 0;i < arr.length-1;i++){
            int correct = arr[i] - 1;
            if (arr[i] != correct){
                swap(arr,i,correct);
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
