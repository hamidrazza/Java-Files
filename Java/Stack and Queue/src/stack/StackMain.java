package stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new DynamicStack(5);
        stack.push(12);
        stack.push(14);
        stack.push(54);
        stack.push(32);
        stack.push(5);
        stack.push(15);

        // pop() --> returns the element which is removed.
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
