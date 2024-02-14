

/*

	160. Intersection of Two Linked Lists
	Easy

	14537

	1308

	Add to List

	Share
	Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

	For example, the following two linked lists begin to intersect at node c1:


	The test cases are generated such that there are no cycles anywhere in the entire linked structure.

	Note that the linked lists must retain their original structure after the function returns.

	Custom Judge:

	The inputs to the judge are given as follows (your program is not given these inputs):

	intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
	listA - The first linked list.
	listB - The second linked list.
	skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
	skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
	The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.


*/





/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
//         Set<ListNode> st=new HashSet<>();
        
//         ListNode t1=headA;
        
//         while(t1 != null){
            
//             st.add(t1);
//             t1=t1.next;
//         }
            
            
        
//         ListNode t2=headB;
        
//         while(t2 != null){
            
//             if(st.contains(t2)){
                
//                 return t2;
//             }
            
//             st.add(t2);
//             t2=t2.next;
//         }
        
//         return null;
        
        
        ListNode a=headA;
        ListNode b=headB;
        
        while(a != b){
            
            a = (a == null)?headB:a.next;
            b = (b == null)?headA:b.next;
        }
        
        return b;
        
    }
}