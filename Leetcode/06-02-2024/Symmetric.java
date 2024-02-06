



/*
	101. Symmetric Tree


	Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
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
    
    public boolean isMirror(TreeNode root1,TreeNode root2){
        
        if(root1 == null && root2 == null)
            return true;
        if((root1 != null && root2 == null) || (root1 == null && root2 != null) || root1.val != root2.val)
            return false;
        boolean left=isMirror(root1.left,root2.right);
        boolean right=isMirror(root1.right,root2.left);
        
        return left&&right;
    }
    
    
    public boolean isSymmetric(TreeNode root) {
        
       
        
        if(root == null)
            return false;
        
        return isMirror(root.left,root.right);
         
    
        
    }
}