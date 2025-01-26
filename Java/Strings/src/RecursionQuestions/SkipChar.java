package RecursionQuestions;

public class SkipChar {
    public static void main(String[] args) {
        String str = "bapplccapplehd";
//        skip("",str);
//        System.out.println(skip(str));
//        System.out.println(skipApple(str));
        System.out.println(skipAppNotApple(str)); // skip "app" but not "apple"

    }
    static void skip(String ans, String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);

        if(ch == 'a'){
            // Don't add anything if char is 'a'.
            skip(ans,str.substring(1));
        }else{
            // Adding the char because it's not 'a'.
            skip(ans + ch,str.substring(1));
        }

    }
    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);

        if(ch == 'a'){
            // Don't add anything if char is 'a'.
            return skip(str.substring(1));
        }else{
            // Adding the char because it's not 'a'.
            return ch + skip(str.substring(1));
        }

    }
    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
            // Don't add anything if char is 'a'.
            return skipApple(str.substring(5));
        }else{
            // Adding the char because it's not 'a'.
            return str.charAt(0) + skipApple(str.substring(1));
        }

    }
    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            // Don't add anything if char is 'a'.
            return skipAppNotApple(str.substring(3));
        }else{
            // Adding the char because it's not 'a'.
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }

    }
}
