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
//Leetcode no=206
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
    public ListNode reverseList(ListNode head) {
        return reverse(head,null);
        
    }
}
