package cloning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human hamid = new Human(21,"Hamid");
//        Human twin = new Human(hamid);

        // In the above statements we're doing object cloning, but we spent a lot of time because of 'new' keyword.
        // That's why java provides us an interface 'Cloneable'

        Human twin2 = (Human) hamid.clone();
        System.out.println(twin2.age + " " + twin2.name);
        System.out.println(Arrays.toString(twin2.arr));

        twin2.arr[0] = 100;
        // Main object's array will also be changed, It's called
        System.out.println(Arrays.toString(twin2.arr));
        System.out.println(Arrays.toString(hamid.arr));

    }
}