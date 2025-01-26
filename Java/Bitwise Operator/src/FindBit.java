// Find the ith bit of a given no.
public class FindBit {
    public static void main(String[] args) {
        int num = 42;
        int bit = 4;
        System.out.println(Integer.toBinaryString(num));

        int bitMask = (1 << (bit-1));

        if((num & bitMask) != 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
