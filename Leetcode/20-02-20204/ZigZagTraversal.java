/*
	
	103. Binary Tree Zigzag Level Order Traversal
	Medium

	10499

	283

	Add to List

	Share
	Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        
        if(root == null)
            return ans;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        boolean flag=false;
        while(!q.isEmpty()){
            
            int size=q.size();
            
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                
                TreeNode curr=q.poll();
                list.add(curr.val);
                
                
                if(curr.left != null)
                    q.add(curr.left);
                
                if(curr.right != null)
                    q.add(curr.right);
                      
            }
            
            if(flag)
                Collections.reverse(list);
            ans.add(list);            
            flag=!flag;
                
            
        }
        
        return ans;
        
    }
}