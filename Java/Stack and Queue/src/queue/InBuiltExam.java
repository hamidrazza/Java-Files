package queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExam {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(21);
        queue.offer(5);
        queue.offer(7);

        // remove() --> returns the removed element.
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
