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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode t1,t2,t3,t4,l3;
        t1=l1;
        t2=l2;
        t3=null;
        t4=new ListNode();
        l3=null;
        boolean carry=false;
        while(t1!=null && t2!=null)
        {
            t3=new ListNode();
            t3.val=t1.val+t2.val;
            if(carry==true)
            {
                t3.val++;
                carry=false;
            }
            if(t3.val>=10)
            {
                carry=true;
                t3.val=t3.val%10;
            }
            if(l3==null)
            {
                l3=t3;
            }

            t4.next=t3;
            t4=t3;
            t1=t1.next;
            t2=t2.next;
        }

        while(t1!=null)
        {
            t3=new ListNode();
            t3.val=t1.val;
            if(carry==true)
            {
                t3.val++;
                carry=false;
            }
            if(t3.val>=10)
            {
                carry=true;
                t3.val=t3.val%10;
            }
            t4.next=t3;
            t4=t3;
            t1=t1.next;
        }
         while(t2!=null)
        {
            t3=new ListNode();
            t3.val=t2.val;
            if(carry==true)
            {
                t3.val++;
                carry=false;
            }
            if(t3.val>=10)
            {
                carry=true;
                t3.val=t3.val%10;
            }
            t4.next=t3;
            t4=t3;
            t2=t2.next;
        }
        if(carry==true)
        {
            t3=new ListNode();
            t3.val=1;
            t4.next=t3;
            t4=t3;
        }
        return l3;
    }
}