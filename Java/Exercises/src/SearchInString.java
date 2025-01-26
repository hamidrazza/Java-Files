import java.util.*;

// Searching using linear search in String
public class SearchInString {
    public static void main(String[] args) {
        String name = "Hamid";
        char target = 'i';
        System.out.println(search2(name, target));
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    // Searching using for-each loop
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
