public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

        Integer a = 10;
        Integer b = 20;

        swap(a,b); // It can't swap the values, because Integer is a final class.

        final int BONUS = 2;
//        BONUS = 3; // It throws error because final can't change.

        final A rahul = new A("rahul");
        rahul.name = "new Name";

        // when a non-primitive is final, you can't reassign it.
//        rahul = new A("new");

    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A {
    final int num = 10; // initialze where you declare final.
    String name;

    A(String name){
        this.name = name;
    }
}
