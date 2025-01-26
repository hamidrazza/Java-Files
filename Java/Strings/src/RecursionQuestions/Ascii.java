package RecursionQuestions;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
//        subseqAscii("","abc");
        System.out.println(subseqAsciiRet("","abc"));
    }
    static void subseqAscii(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        subseqAscii(ans + ch,str.substring(1)); // First add the char
        subseqAscii(ans ,str.substring(1)); // Another to the current char
        subseqAscii(ans + (ch+0) ,str.substring(1)); // Print the Ascii value of char

    }
    static ArrayList<String> subseqAsciiRet(String ans, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> first = subseqAsciiRet(ans + ch,str.substring(1)); // First add the char
        ArrayList<String> second = subseqAsciiRet(ans ,str.substring(1)); // Another to the current char
        ArrayList<String> third = subseqAsciiRet(ans + (ch+0),str.substring(1)); // Another to the current char

        first.addAll(second); //Add all second elements in first.
        first.addAll(third); //Add all the third elements in first.
        return first; // All the elements is in the first
    }
}
