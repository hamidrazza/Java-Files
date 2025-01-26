package stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int item) throws StackException{
        if(isFull()){
            throw new StackException("Can't push, Stack is full !!");
        }
        ptr++;
        data[ptr] = item;
    }
    protected boolean isFull(){
        return ptr == data.length-1;
    }
    protected boolean isEmpty(){
        return ptr == -1;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Can't pop item from Empty Stack !!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
         // Both are doing the same thing.

        return data[ptr--];
    }
    public int peek(){
        return data[ptr];
    }
}
