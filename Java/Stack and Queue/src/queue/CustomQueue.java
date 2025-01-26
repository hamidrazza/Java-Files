package queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean offer(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }
    protected boolean isFull(){
        return end == data.length;
    }
    protected boolean isEmpty(){
        return end == 0;
    }

    // This remove will take O(N) time, which is not good.
    // So we will use Circular Queue because it takes O(1) time to remove item
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[end];

        // Shifting all the elements towards left
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }

        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Can't peek, Queue is empty.");
        }
        return data[end];
    }

}
