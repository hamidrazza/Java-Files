package RecursionQuestions;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        permutation("","abc");
        System.out.println(permutationRet("","abc"));
//        System.out.println(permutationCount("","abc"));
    }
    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

            permutation(first+ch+second,up.substring(1));
        }
    }
    static ArrayList<String> permutationRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

            ans.addAll(permutationRet(first+ch+second,up.substring(1)));
        }

        return ans;
    }
    static int permutationCount(String p, String up){
        // No. of any permutation = Factorial of the length of the string. = (Factorial(arr.length))
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

            count += permutationCount(first+ch+second,up.substring(1));
        }
        // After adding all the local counts return it to main function.
        return count;
    }
}
