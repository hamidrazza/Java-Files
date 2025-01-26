package RecursionQuestions;

import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
//        diceSum("",4);
        System.out.println(diceSumRet("",4));
        System.out.println(diceSumCount("",4));
    }

    // Direct printing the answer
    static void diceSum(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            diceSum(p+i,target-i);
        }
    }

    // Adding into the Arraylist and returning it.
    static ArrayList<String> diceSumRet(String p, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceSumRet(p+i,target-i));
        }
        return ans;
    }
    //Counting how many answers of this particular call
    static int diceSumCount(String p, int target){
        if (target == 0){
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count += diceSumCount(p+i,target-i);
        }
        return count;
    }
    // If dice have custom faces like (7 or 8 faces)
    static void diceFace(String p, int target, int face){
        if (target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p+i,target-i, face);
        }
    }
    // Adding into the Arraylist and returning it.
    static ArrayList<String> diceFaceRet(String p, int target, int face){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            ans.addAll(diceFaceRet(p+i,target-i, face));
        }
        return ans;
    }
}
