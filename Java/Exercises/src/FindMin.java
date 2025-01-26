public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,44,22,52,11,23,21};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
