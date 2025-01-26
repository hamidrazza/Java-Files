package stack;

import java.util.Stack;

public class InbuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(5);
        stack.push(42);
        stack.push(11);

        // pop() returns the element which is removed.
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
