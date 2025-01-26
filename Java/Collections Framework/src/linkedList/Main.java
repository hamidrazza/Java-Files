package linkedList;

import linkedList.questions.MergeSort;

public class Main{
    public static void main(String[] args) {
        LL list = new LL();

        // Insertion in LinkedList
        list.insertFirst(3);
        list.insertFirst(12);
        list.insertFirst(8);
        list.insertFirst(6);

        list.insertLast(34);
        list.insert(55,3);

        list.insertRec(88,3);

        list.display();

        // Deletion in LinkedList
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();

        // Finding the node of given value.
//        System.out.println(list.find(8));
//        list.display();


/*        // Doubly LinkedList
        DLL list = new DLL();

        // Insertion in DoublyLL
        list.insertFirst(3);
        list.insertFirst(12);
        list.insertFirst(8);
        list.insertFirst(6);

        list.display();
*/

    }
}