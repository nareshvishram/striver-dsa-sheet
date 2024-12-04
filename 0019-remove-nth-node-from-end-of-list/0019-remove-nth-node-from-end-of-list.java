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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head,fast=head;
        while(n-->1){
            fast=fast.next;
        }
        ListNode prev=head;
        while(fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;

        }
        if(prev==slow)
            return head.next;
        prev.next=slow.next;
        return head;
    }
}