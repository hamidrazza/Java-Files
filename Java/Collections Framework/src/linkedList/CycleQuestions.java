package linkedList;

import linkedList.questions.ListNode;

public class CycleQuestions {

    // https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);

        if(slow == 1){
            return true;
        }
        return false;
    }
    private int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans += rem * rem; // because we want square of the remainder.
            num /= 10;
        }
        return ans;
    }

    // https://leetcode.com/problems/middle-of-the-linked-list/
    public ListNode middleNode(ListNode head) {
        ListNode fast =  head;
        ListNode slow =  head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
