/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        if(head == null || head.next == null) return head;
        while(head.next != null){ 
            stack.push(head.val);
            head = head.next;
        } 
        ListNode ret = head;
        while(stack.peek() != null){ 
            head.next = new ListNode(stack.pop()); 
            head = head.next;
        } 
        return ret;
    }
}
