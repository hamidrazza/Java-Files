// Finding the right most set bit
public class RightMostBit {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(Integer.toBinaryString(num));
        int ans = num & (~num+1);
        System.out.println(ans/2+1);
    }
}
