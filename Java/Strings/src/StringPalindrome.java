public class StringPalindrome {
    public static void main(String[] args) {
        String str = "bcacb";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        if(str == null || str.isEmpty()){
            return true; // Or according to the question.
        }

        str = str.toLowerCase();
        for(int i = 0; i <= str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
