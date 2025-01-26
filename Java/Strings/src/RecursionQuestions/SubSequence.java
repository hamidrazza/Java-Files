package RecursionQuestions;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
//        subseq("","abc");
        System.out.println(subseqRet("","abc"));
    }
    static void subseq(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        subseq(ans + ch,str.substring(1)); // First add the char
        subseq(ans ,str.substring(1)); // Another to the current char

    }
    static ArrayList<String> subseqRet(String ans, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> left = subseqRet(ans + ch,str.substring(1)); // First add the char
        ArrayList<String> right = subseqRet(ans ,str.substring(1)); // Another to the current char

        left.addAll(right); //Add all the right elements in first.
        return left;
    }
}
