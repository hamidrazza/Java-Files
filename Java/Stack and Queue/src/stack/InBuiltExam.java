package stack;

import java.util.Stack;

public class InBuiltExam {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(14);
        stack.push(54);
        stack.push(32);

        // pop() --> returns the element which is removed.
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
