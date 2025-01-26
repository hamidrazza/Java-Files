package queue;

import stack.CustomStack;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CircularQueue queue = new DynamicQueue(5);

        queue.offer(12);
        queue.offer(55);
        queue.offer(32);
        queue.offer(17);

        queue.display();

        System.out.println(queue.remove());
        queue.offer(133);
        queue.display();

        System.out.println(queue.remove());
        queue.offer(99);
        queue.display();

    }
}
