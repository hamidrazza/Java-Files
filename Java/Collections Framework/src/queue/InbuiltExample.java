package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuiltExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(11);
        queue.add(25);
        queue.add(7);
        queue.add(9);

        // removes() returns the removed item.
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
