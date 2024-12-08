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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0)
            return head;
        ListNode ptr=head;
        int len=0;
        while(ptr.next!=null){
            ptr=ptr.next;
            len++;
        }
        //System.out.println(len+" "+ptr.val);
        len++;
        k=(len-(k%len));
        ptr.next=head;
        ptr=head;
        while(k-->1){
            ptr=ptr.next;
        }
        head=ptr.next;
        //System.out.println(ptr.val);
        ptr.next=null;
        return head;
    }
}