/*
	148. Sort List
	Medium

	11201

	333

	Add to List

	Share
	Given the head of a linked list, return the list after sorting it in ascending order.


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
    public ListNode sortList(ListNode head) {
        
        PriorityQueue<Integer> ans=new PriorityQueue<>();
        
        ListNode temp=head;
        
        while(temp!=null)
        {	
            ans.add(temp.val);
            temp=temp.next;
        }
        
        temp=head;
        
        while(temp!=null && !ans.isEmpty())
        {
            temp.val=ans.poll();
            temp=temp.next;
        }
        
        return head;
        
    }
}	