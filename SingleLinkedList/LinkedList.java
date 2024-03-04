class LinkedListNode{
	
	int val;
	LinkedListNode next;

	LinkedListNode(int val){

		this.val=val;
		this.next=null;
	}
}

class LinkedList{

	public static void printList(LinkedListNode head){

		if(head == null)
			return;
		
		LinkedListNode temp=head;
		while(temp != null){

			System.out.print(temp.val+" ");
			temp=temp.next;
		}

	}

	public static LinkedListNode addBegin(LinkedListNode head,int data){

		LinkedListNode newNode=new LinkedListNode(data);

		newNode.next=head;

		return newNode;
	}

	public static LinkedListNode addLast(LinkedListNode head,int data){

		LinkedListNode newNode=new LinkedListNode(data);

		LinkedListNode temp=head;
		while(temp.next != null){

			temp=temp.next;
		}

		temp.next=newNode;

		return head;
	}

	public static LinkedListNode deleteBegin(LinkedListNode head){

		if(head ==null || head.next == null)
			return null;
		return head.next;
	}

	public static LinkedListNode deleteLast(LinkedListNode head){

		if(head == null || head.next == null)
			return null;

		LinkedListNode temp=head;
		while(temp.next.next != null)
			temp=temp.next;

		temp.next=null;
		return head;
	}


	public static LinkedListNode addPos(LinkedListNode head,int data,int pos){

		LinkedListNode newNode=new LinkedListNode(data);

		if(pos == 0){

			newNode.next=head;
			return newNode;

		}

		LinkedListNode temp=head;

		for(int i=0;i<pos-1;i++)
			temp=temp.next;

		newNode.next=temp.next;	
		temp.next=newNode;
		return head;

	}


	public static LinkedListNode deletePos(LinkedListNode head,int pos){

		if(pos == 0 )
			return head.next;

		LinkedListNode dummy=new LinkedListNode(-1);
		
		dummy.next=head;

		LinkedListNode temp=dummy;
		// LinkedListNode prev=dummy;

		for(int i=0;i<pos;i++){
			temp=temp.next;
		}

		temp.next=temp.next.next;
		return dummy.next;
	}

	public static void main(String args[]){

		

		LinkedListNode head=new LinkedListNode(10);
		LinkedListNode node1=addLast(head,20);
		LinkedListNode node2=addBegin(node1,30);
		printList(node2);


		LinkedListNode delNode=deleteLast(node2);

		System.out.println();
		printList(delNode);

		System.out.println();
		LinkedListNode nodePos=addPos(delNode,100,1);
		printList(nodePos);

		System.out.println();
		LinkedListNode delPos=deletePos(nodePos,2);
		printList(delPos);


		

	}
}