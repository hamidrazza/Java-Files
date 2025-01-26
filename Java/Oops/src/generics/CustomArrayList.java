package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    // Helper methods
    private void resize() {
        int[] temp = new int[data.length * 2];
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
        CustomArrayList list = new CustomArrayList();
//        list.add(5);
//        list.add(7);
//        list.add(1);

        for (int i = 1; i <= 10; i++) {
            list.add(2*i);
        }

        System.out.println(list);
    }

}
