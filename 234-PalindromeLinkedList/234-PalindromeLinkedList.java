// Last updated: 25/08/2025, 17:21:20
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
    // public boolean isPalindrome(ListNode head) {
    //     ArrayList<Integer> al=new ArrayList<>();
    //     ListNode temp=head;
    //     while(temp!=null){
    //         al.add(temp.val);
    //         temp=temp.next;
    //     }
    //     int i=0;
    //     int j=al.size()-1;
    //     while(i<j){
    //         if(al.get(i)!=al.get(j)){
    //             return false;
    //         }
    //         i++; 
    //         j--;
    //     }
    //     return true;
    // }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true; 
    }
}