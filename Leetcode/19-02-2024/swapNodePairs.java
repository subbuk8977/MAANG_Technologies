/*
	24. Swap Nodes in Pairs
	Medium

	11666

	430

	Add to List

	Share
	Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

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
    
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        ListNode secondNode=head.next;
        ListNode thirdNode=head.next.next;
        
        secondNode.next=head;
        head.next=swapPairs(thirdNode);
        
        return secondNode;
        
    }
}