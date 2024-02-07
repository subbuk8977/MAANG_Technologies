

/*
	98. Validate Binary Search Tree
	
	Given the root of a binary tree, determine if it is a valid binary search tree (BST).

	A valid BST is defined as follows:

		The left subtree of a node contains only nodes with keys less than the node's key.
		The right subtree of a node contains only nodes with keys greater than the node's key.
		Both the left and right subtrees must also be binary search trees.

*/








/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        
       return isBST(root,null,null);
        
    }
    
    private static boolean isBST(TreeNode root,TreeNode minNode,TreeNode maxNode)
    {
        if(root == null)
            return true;
        if(minNode !=null && minNode.val>=root.val)
            return false;
        if(maxNode !=null && maxNode.val<=root.val)
            return false;
        
        return isBST(root.left,minNode,root) && isBST(root.right,root,maxNode);
    }
        
        
}