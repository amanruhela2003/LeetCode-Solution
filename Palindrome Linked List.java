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
//Leetcode no= 234
class Solution {

    public ListNode reverse(ListNode current,ListNode prev)
    {
        //Base Condition
        if(current==null)
        {
            return prev;
        }
        ListNode nextNode=current.next;
        current.next=prev;
        return reverse(nextNode,current);
    }
    boolean compare(ListNode l1,ListNode l2)
    {
        while(l1!=null && l2!=null)
        {
            if(l1.val == l2.val){
                l1=l1.next;
                l2=l2.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next==null)
        {
            return true;
        }
        ListNode slow,fast;
        fast=slow=head;
        ListNode prev=null,midNode=null;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }

        //Odd no of node
        //fast point to last node;
        if(fast!=null)
        {
            midNode=slow;
            slow=slow.next;
        }

        ListNode secondHalf=slow;
        prev.next=null;
        secondHalf=reverse(secondHalf,null);
        boolean result=compare(head,secondHalf);
        return result;
        
    }
}
