

/*
	Check if all leaves are at same level :


	Given a binary tree with n nodes, check if all leaves are at same level or not. Return true/false depending on whether all the leaf nodes are at the same level or not.
	
*/

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution
{
    int height(Node root){
        
        if(root == null)
            return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
    }
    
    boolean check(Node root)
    {
	// Your code here
	    
	    if(root == null || (root.left == null && root.right == null))
	        return true;
	    
	    int h=height(root);
	    int count=0;
	    
	    Queue<Node> q=new LinkedList<>();
	    q.add(root);
	    
	    int leafs=0,total_leafs=0;
	    while(!q.isEmpty()){
	        
	        int size=q.size();
	        count++;
	        
	        for(int i=0;i<size;i++){
	            
	            Node curr=q.poll();
	            
	            if(curr.left == null && curr.right == null){
	                
	                total_leafs++;
	            }
	            
	            if(curr.left != null)
	                q.add(curr.left);
	           
	           if(curr.right != null)
	                q.add(curr.right);
	        }
	        
	        leafs=size;
	        
	    }
	    
	    return leafs == total_leafs;
    }
}
