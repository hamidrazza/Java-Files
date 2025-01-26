public class SetBit {
    public static void main(String[] args) {
        int num = 5;
        int bit = 2;
        int bitMask = (1 << (bit-1));

        System.out.println(Integer.toBinaryString(num));
        int ans = num | bitMask;
        System.out.println(ans);
    }
}
