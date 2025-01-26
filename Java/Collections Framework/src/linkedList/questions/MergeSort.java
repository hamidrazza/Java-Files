package linkedList.questions;

import linkedList.LL;

import java.util.List;

// https://leetcode.com/problems/sort-list/
public class MergeSort {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    public ListNode merge(ListNode first, ListNode second) {
        ListNode dummyhead = new ListNode();
        ListNode tail = dummyhead;

        while (first != null && second != null) {
            if (first.val < second.val) {
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

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode secondHead = reverse(mid);
        ListNode reReverseHead = secondHead;

        while (head != null && secondHead != null) {
            if (head.val == secondHead.val) {
                head = head.next;
                secondHead = secondHead.next;
            } else {
                break;
            }
        }
        reverse(reReverseHead);
        if (head == null || secondHead == null) {
            return true;
        }
        return false;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);

        ListNode headFirst = head;
        ListNode headSecond = reverse(mid);

        // Rearrange
        while (headFirst != null && headSecond != null) {
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }
        if (headFirst != null) {
            headFirst.next = null;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
        return head;
    }


}
