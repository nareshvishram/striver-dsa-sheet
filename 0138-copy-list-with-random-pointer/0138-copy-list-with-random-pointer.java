/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        head=insert(head);
        head=connectRandom(head);
        head=remove(head);
        return head;
    }
    private Node remove(Node head){
       Node dummyNode=new Node(-1);
       Node res=dummyNode;
       Node ptr=head;
       while(ptr!=null){
        res.next=ptr.next;
        res=res.next;
        ptr.next=ptr.next.next;
        ptr=ptr.next;
       }
       return dummyNode.next;
    }
    private Node connectRandom(Node head){
        Node ptr=head;
        while(ptr!=null){
            Node copy=ptr.next;
            if(ptr.random!=null)
                copy.random=ptr.random.next;
            else
                copy.random=null;
            ptr=copy.next;
        }
        return head;
    }
    private Node insert(Node head){
        Node ptr=head;
        while(ptr!=null){
            Node copy=new Node(ptr.val);
            Node next=ptr.next;
            copy.next=ptr.next;
            ptr.next=copy;
            ptr=next;
        }
        return head;
    }
}