package generics;
import java.util.Arrays;
import java.util.List;

// Using wild card, we can restrict the generic type
// Here T should either be 'Number' or 'subclasses of Number'
public class WildCardsExample<T extends Number>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardsExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    // Use of WildCard
    public void getList(List<? extends Number> list){
        // If you use List<Number> --> then you can only pass Number type
        // But List<? extends Number> --> then you can also pass subclasses of it.
        // Do something.
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    // Helper methods
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
        WildCardsExample<Integer> list = new WildCardsExample<>();

        for (int i = 1; i <= 10; i++) {
            list.add(2*i);
        }

        System.out.println(list);
    }

}
