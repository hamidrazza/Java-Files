package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box obj1 = new Box();
        Box obj2 = new Box(4.5,6.2,2.2);
        Box obj3 = new Box(obj2);

        System.out.println(obj1.l + " " + obj1.h + " " + obj1.w);
        System.out.println(obj2.l + " " + obj2.h + " " + obj2.w);

        BoxWeight obj4 = new BoxWeight(5.2,8.1,3.4,50);
        System.out.println(obj4.l + " " + obj4.h + " " + obj4.w + " " + obj4.weight);

        /*
        Here reference is of 'Box' type, so you can only access the reference type variables i.e. (l,w,h)
        But on the RHS reference type is BoxWeight that's why you can pass the weight in the argument.
         */
        Box obj5 = new BoxWeight(5,7,3,8);
    }
}
