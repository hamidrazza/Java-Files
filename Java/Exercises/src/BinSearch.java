import java.util.*;

//Binary Search using Recursion
public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {12,32,45,76,78,82,98};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter target element : ");
        int target = in.nextInt();
        int ans = search(arr,target,0,arr.length-1);
        System.out.println(ans);

    }
    static int search(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if (target > arr[mid]){
            return search(arr,target,mid+1,e);
        }else{
            return search(arr,target,s,mid-1);
        }
    }
}
