/*  21. Merge Two Sorted Lists:
    
        You are given the heads of two sorted linked lists list1 and list2.

        Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

        Return the head of the merged linked list.
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        //         if(list1==null && list2==null)
//             return null;
        
//         ListNode t1=list1;
//         ListNode t2=list2;
        
//         ListNode head=new ListNode();
//         ListNode dummy=head;
        

        
//         while(t1!=null && t2!=null)
//         {
//             if(t1.val<t2.val)
//             {
//                 dummy.next=t1;
//                 t1=t1.next;
//             }
//             else
//             {
//                 dummy.next=t2;
//                 t2=t2.next;
//             }
//             dummy=dummy.next;
//         }
        
//         while(t1!=null)
//         {
//             dummy.next=t1;
//             t1=t1.next;
//             dummy=dummy.next;
//         }
        
//          while(t2!=null)
//         {
//             dummy.next=t2;
//             t2=t2.next;
//             dummy=dummy.next;
//         }
        
//         return head.next;
        
        
        if(list1 == null)
            return list2;
        
        if(list2 == null)
            return list1;
        
        if(list1.val < list2.val){
            
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }
            
        
        else{
            
            list2.next=mergeTwoLists(list1,list2.next);
            return  list2;
        }
            
            
        
        
    }
}