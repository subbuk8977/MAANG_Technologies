/*

	19. Remove Nth Node From End of List :

	Given the head of a linked list, remove the nth node from the end of the list and return its head.

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
    
    public static int lengthLL(ListNode head){
        
        ListNode temp=head;
        int length=0;
        
        while(temp != null){
            
            length++;
            temp=temp.next;
        }
        
        return length;
    }
    
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int length=lengthLL(head);
        int pos=length-n;
        
        if(pos == 0)
            return head.next;
        
        ListNode temp=head;
        
        for(int i=0;i<pos-1;i++){
            
            temp=temp.next;
        }
        
        temp.next=temp.next.next;
        
        return head;
        
    }
}