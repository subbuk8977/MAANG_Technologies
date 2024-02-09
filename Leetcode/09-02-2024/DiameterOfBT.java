
/*

	Given the root of a binary tree, return the length of the diameter of the tree.

	The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

	The length of a path between two nodes is represented by the number of edges between them.
/*





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
    
    public int height(TreeNode root){
        
        int length=0;
        
        if(root == null)
            return 0;
        
        int leftHeight=1+height(root.left);
        int rightHeight=1+height(root.right);
        
        return Math.max(leftHeight,rightHeight);
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        
        
        if(root == null)
            return 0;
        
        int diameter=height(root.left)+height(root.right);
        
        int leftD=diameterOfBinaryTree( root.left);
        int rightD=diameterOfBinaryTree( root.right);
        
        return Math.max(diameter,Math.max(leftD,rightD));
        
    }
    

}