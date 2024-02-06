
/*	

	102. Binary Tree Level Order Traversal
	
	Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        List<List<Integer>> result=new ArrayList<>();
        
        if(root == null)
            return result;
        
        while(!q.isEmpty()){
            
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            
            for(int i=0;i<size;i++){
                
                TreeNode node=q.poll();
                list.add(node.val);
                
                if(node.left != null)
                    q.add(node.left);
                
                if(node.right != null)
                    q.add(node.right);
            }
            
            result.add(new ArrayList<>(list));
        }
        
        return result;
        
        
    }
}