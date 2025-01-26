import java.util.Arrays;
public class swap_array_element {
    public static void main(String[] args) {
        int[] arr = {43,32,23,54,22,11,98};
        int element1 = arr[3];
        int element2 = arr[6];
        System.out.println(Arrays.toString(arr));
        swapArray(arr,element1,element2);
        System.out.println(Arrays.toString(arr));
    }
    static void swapArray(int[] arr, int ele1, int ele2){
        int temp = arr[ele1];
        arr[ele1] = arr[ele2];
        arr[ele2] = temp;
    }
}
