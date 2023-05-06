
class Solution {
    public ListNode swapPairs(ListNode head) {
        //corner cases
        if(head==null || head.next==null) return head;

        //variable initialize
        ListNode newHead=head.next;//new head of the LL after swap
        ListNode a=head;//use to swap the value
        ListNode b=head.next;//use to swap value with Node a
        ListNode pre=null;//use to link the node after swap the value 


        while(a!=null && b!=null)
        {
          a.next=b.next;
          b.next=a;
          if(pre!=null) pre.next=b;//it link the swaped pair
          if(a.next==null) break;//it will execute for the last pair of the LL
          b=a.next.next;
          pre=a;
          a=a.next;
        }
        return newHead;
    }
}
