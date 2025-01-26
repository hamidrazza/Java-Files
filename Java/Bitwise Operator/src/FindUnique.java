// Every no comes twice only a number is comes once. Find that number.
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,1,1,3,6,4};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int odd = 0;
        for (int n : arr){
            odd = odd ^ n;
        }
        return odd;
    }
}
