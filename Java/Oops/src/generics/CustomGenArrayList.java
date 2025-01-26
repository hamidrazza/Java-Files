package generics;
import java.util.Arrays;

//Making custom generic ArrayList

public class CustomGenArrayList <T>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
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
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(2*i);
        }

        System.out.println(list);
    }

}
