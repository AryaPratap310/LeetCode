// Last updated: 25/08/2025, 17:21:35
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
    public ListNode removeElements(ListNode head, int val) {
    //    ListNode curr=head;
    //    ListNode prev=head;
    //    while(curr!=null){
    //         if(curr.val==val){
    //             prev.next=curr.next;
    //             // curr.next=null;
    //             curr=curr.next;
    //         }
    //         else{
    //             prev=curr;
    //             curr=curr.next;
    //         }
           
    //    }
    //    return head;

        ListNode curr=head;
        ListNode newhead= new ListNode(0);
        ListNode temp= newhead;
        while(curr!=null){
            if(curr.val==val){
               
            }
            else{
                temp.next=curr;
                temp=temp.next;
            }
            curr=curr.next;

        
        }
        temp.next=null;

        return newhead.next;
    }
}