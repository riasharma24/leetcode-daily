/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> presentElems=new HashSet<>();
        for(ListNode n1=head;n1!=null;n1=n1.next)
        {
            System.out.println("Elem : "+n1);
            if(presentElems.contains(n1))return true;
            else 
            {
                presentElems.add(n1);
                System.out.println(n1);
            }
        }
        return false;
    }
}