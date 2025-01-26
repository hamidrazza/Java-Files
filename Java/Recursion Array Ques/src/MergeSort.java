import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        arr = sort(arr); // Updating the old array.
        sortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // This sorting didn't change the original array So, update it or create new Array.
    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr,0, mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];

        int i=0, j=0, k=0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // It is possible that one array is not empty yet, so we have to add the remaining elements.
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    static void sortInPlace(int[] arr, int s, int e){
        if(e-s == 1){
            return ;
        }
        int mid = s + (e-s)/2;

        sortInPlace(arr,s, mid);
        sortInPlace(arr,mid,e);

        mergeInPlace(arr, s, mid, e);
    }
    static void mergeInPlace(int[] arr, int s, int mid, int e){
        int[] mix = new int[e-s];

        int i=s, j=mid, k=0;
        while(i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // It is possible that one array is not empty yet, so we have to add the remaining elements.
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
