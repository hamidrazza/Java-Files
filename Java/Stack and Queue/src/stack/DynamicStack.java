package stack;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int item) throws StackException {
        if(this.isFull()){
            // Making double size of the stack.
            int[] temp = new int[data.length * 2];

            // Copying all items into temp
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        super.push(item);
    }
}
