public class Example {
    public static void main(String[] args) {
        String str = "G()(al)";
        str.replace("(al)","al");
        str.replace("()","o");
        System.out.println(str);
    }
}
