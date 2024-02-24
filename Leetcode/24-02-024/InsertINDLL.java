
/*	
	 Insertion In Doubly Linked List :

	Problem statement
	You are given a Doubly linked list, where every node in the linked list contains two pointers ‘next’ and ‘prev’ which point to the next node and previous node in the list respectively. All nodes have some positive integer value associated with them. Your task is to insert an integer value ‘VAL’ in the linked list at a given position ‘K’.

	Note:

	The position given will always be less than or equal to the length of the linked list.
	Assume that the Indexing for the linked list starts from 0.

*/










// import java.util.* ;
// import java.io.*; 

// /************************************************************

//  Following is the linkedList class structure:

//  class Node<T> {
//  T data;
//  Node<T> next,prev;

//  public Node(T data) {
//  this.data = data;
//  }
//  }

//  ************************************************************/

public class Solution {

    static Node insert(int k, int val, Node head) {
        // Write your code here.

        Node newNode=new Node(val);

        if(k== 0)
        {

            newNode.next=head;

            head.prev=newNode;

            head=newNode;

            return head;

        }

        int cnt=1;

        

        Node curr=head;

        while(curr!=null && cnt<k)

        {

        cnt++;

        curr=curr.next;

        }

        

        newNode.next=curr.next;

        curr.next=newNode;

        newNode.prev=curr;

        return head;

    }
}