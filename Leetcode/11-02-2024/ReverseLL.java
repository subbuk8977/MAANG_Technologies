/*

	206. Reverse Linked List
	Easy

	20587

	400

	Add to List

	Share
	Given the head of a singly linked list, reverse the list, and return the reversed list.

*/

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
        
//         if(head == null || head.next == null)
//             return head;
        
//         ListNode newHead=reverseList(head.next);
        
//         head.next.next=head;
        
//         head.next=null;
        
        
//         return newHead;
        
        
        if(head == null || head.next == null)
            return head;
        
        ListNode dummy=null
        
        while(head != null){
            
             ListNode curr=head.next;
            
            head.next=dummy;
            
            dummy=head;
            
            
            head=curr;
            
        }
        return head;
    }
}