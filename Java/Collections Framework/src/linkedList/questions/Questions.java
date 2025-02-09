package linkedList.questions;

import java.util.List;

public class Questions extends MergeSort {
    // Reverse a linked List between range
    // https://leetcode.com/problems/reverse-linked-list-ii/description/

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        // Swapping between left & right.
        ListNode next = current.next;
        for (int i = 0; current != null && i < (right - left) + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }

    //https://leetcode.com/problems/reverse-nodes-in-k-group/description/
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        for (int i = 0; current != null && i < k; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        // Swapping between left & right.
        ListNode next = current.next;
        for (int i = 0; current != null && i < k; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;


        return head;

    }

    //https://leetcode.com/problems/rotate-list/description/
    public ListNode rotateRight(ListNode head, int k) {
        if(k < 0 ||head == null || head.next == null){
            return head;
        }
        int length = 1;
        ListNode last = head;
        while(last != null){
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }

}

