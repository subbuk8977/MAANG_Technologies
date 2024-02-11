/*

	234. Palindrome Linked List
	Easy

	15747

	853

	Add to List

	Share
	Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

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
    
    public ListNode reverse(ListNode head)
    {
        ListNode dummy=null;
        
        while(head!=null)
        {
            ListNode temp=head.next;
            head.next=dummy;
            dummy=head;
            head=temp;
        }
        return dummy;
    }
    
    
    public boolean isPalindrome(ListNode head) {
        
        if(head == null)
            return true;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next != null && fast.next.next != null){
            
            slow=slow.next;
            fast=fast.next.next;
        }
        
        slow.next=reverse(slow.next);
        
        slow=slow.next;
        
        while(slow != null){
            
            if(head.val != slow.val)
                return false;
            slow=slow.next;
            head=head.next;
        }
        
        return true;
        
    }
}