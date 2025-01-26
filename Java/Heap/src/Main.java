import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();

        heap.insert(54);
        heap.insert(32);
        heap.insert(12);
        heap.insert(40);
        heap.insert(22);

        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);

    }
}
