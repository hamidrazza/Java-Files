public class OddOrEven {
    public static void main(String[] args) {
        int num = 332;

        System.out.println(isOdd(num));
    }
    static boolean isOdd(int num){
        if ((num & 1) == 1){
            return true;
        }
        return false;
    }
}
