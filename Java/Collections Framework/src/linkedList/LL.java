package linkedList;


import linkedList.questions.MergeSort;

import javax.swing.*;

// Our custom LINKED_LIST
public class LL extends MergeSort {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // Inserting value using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

        size += 1;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        // Means only one element in our LinkedList
        // So, head and tail both are pointing to the same element.
        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size -= 1;

        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        // (size-2) because index start from '0' but size starts from '1';
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next; // Not head.next, because head.next == 1st index value always.
        }
        System.out.println("END");
    }

    public class Node {

        private int value;
        private Node next;

        public Node() { }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // QUESTIONS
    public void deleteDuplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public Node merge(Node first, Node second) {
        Node dummyhead = new Node();
        Node tail = dummyhead;

        while (first != null && second != null) {
            if (first.value < second.value) {
                tail.next = first;
                first = first.next;
                tail = tail.next;
            } else {
                tail.next = second;
                second = second.next;
                tail = tail.next;
            }
        }
        tail.next = (first != null) ? first : second;
        return dummyhead.next;
    }
    Node getMid(Node head){
        Node midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public boolean hasCycle(Node head) {
        Node f = head;
        Node s = head;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;

            if (f == s) {
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(Node head) {
        Node f = head;
        Node s = head;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;

            if (f == s) {
                Node temp = s;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;
                } while (temp != s);
                return length;
            }
        }
        return 0;
    }

    public Node detectCycle(Node head) {
        int length = 0;
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }
        if (length == 0) {
            return null;
        }
        // Now we have length of cycle
        // Finding the start
        Node f = head;
        Node s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }


    // Reversing a Linked-List
    // Using Recursion
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // In-place reversal of Linked List --> V.V.I
    public void reverse(){
        if(size < 2){
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
    }

    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();

        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);

        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);

//        LL ans = merge(list1, list2);
//        ans.display();

//        list.deleteDuplicates();
//        list.display();
    }
}
