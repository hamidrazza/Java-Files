package RecursionQuestions;

import java.util.ArrayList;

public class DialPad {
    public static void main(String[] args) {
//        pad("","12");
        ArrayList<String> ans = padRet("","12");
//        System.out.println(ans);
        System.out.println(padRetCount("","12"));
    }

    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0'; // This convert '1' into 1

        for (int i = (digit-1)*3; i < (digit * 3); i++) {
            char ch = (char)('a' + i);
            pad(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> padRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0'; // This convert '1' into 1
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit-1)*3; i < (digit * 3); i++) {
            char ch = (char)('a' + i);

            ans.addAll(padRet(p+ch,up.substring(1)));
        }
        return ans;
    }
    static int padRetCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0)-'0'; // This convert '1' into 1
        int count = 0;
        for (int i = (digit-1)*3; i < (digit * 3); i++) {
            char ch = (char)('a' + i);

            count += (padRetCount(p+ch,up.substring(1)));
        }
        return count;
    }
}
