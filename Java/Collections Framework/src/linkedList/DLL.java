package linkedList;

public class DLL {
    private Node head;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size += 1;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
