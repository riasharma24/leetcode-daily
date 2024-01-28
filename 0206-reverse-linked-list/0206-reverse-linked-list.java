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
        if(head==null)return null;
        ListNode p1,p2,g;
        p1=head;
        p2=head.next;
        g=null;
        while(p1!=null)
        {
            p1.next=g;
            g=p1;
            p1=p2;
            if(p2!=null)p2=p2.next;
        }
        head=g;
        return head;
    }
}