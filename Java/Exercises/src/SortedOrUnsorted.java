import java.util.*;
public class SortedOrUnsorted {
    public static void main(String[] args) {
        int[] arr = {44,32,21,20,13,15,10,9,5};
        check(arr);
    }

    public static void check(int[] arr) {
        int count = 0;
        if(arr[0] < arr[arr.length-1]){
            for (int i = 0;i < arr.length-1;i++){
                int j = i+1;
                if (arr[i] < arr[j]){
                    count++;
                }else{
                    System.out.println("Array is unsorted");
                }
            }
        }
        else{
            for (int i = 0;i < arr.length-1;i++){
                int j = i+1;
                if (arr[i] > arr[j]){
                    count++;
                }else{
                    System.out.println("Array is unsorted");
                }
            }
        }
        if(count == arr.length-1){
            System.out.println("Array is sorted");
        }
    }
}
