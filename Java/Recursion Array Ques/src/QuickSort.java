import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        sort(arr,0,arr.length-1 );
//        System.out.println(Arrays.toString(arr));

        // Java provided internal sorting
        Arrays.sort(arr); // This one is also use the Quick Sort.
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr, int low, int high){
        // Base Condition
        if(low >= high){
            return;
        }
        int s = low, e = high;
        int m = s + (e-s)/2; // Using mid we are dividing the array into two halves, So our work will do easily.
        int pivot = arr[m];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            // Violating the condition that means we need to swap the elements
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                // And just increase/ decrease the s/e accordingly.
                s++;
                e--;
            }
        }
        // Now our recursive calls,
        sort(arr,low,e);
        sort(arr,s, high);

    }
}
