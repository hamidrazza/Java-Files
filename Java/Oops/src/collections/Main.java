package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
/*
        list2.add(41);
        list2.add(32);
        list2.add(25);
        list2.add(21);
        System.out.println(list2);
   */

        // ArrayList & Vector are same but, Arraylist is faster than Vector.
        List<Integer> vector = new Vector<>();
        vector.add(22);
        vector.add(11);
        vector.add(32);
        vector.add(54);
        System.out.println(vector);

    }
}
