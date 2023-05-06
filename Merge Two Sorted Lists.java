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

//Leetcode  no=21
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
 
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode fakeHead = new ListNode(0);
        ListNode res = fakeHead;
        while(l1 != null && l2 != null)
        {
            if(l1.val <= l2.val)
            {
                res.next = l1;
                l1 = l1.next;
            }
            else
            {
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }
        if(l1 == null)
            res.next = l2;
        if(l2 == null)
            res.next = l1;
        return fakeHead.next;

    }
}
