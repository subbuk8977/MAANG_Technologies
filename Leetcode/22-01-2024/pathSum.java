/*
	
	GFG POTD --- Paths from root with a specified sum

	Given a Binary tree and a sum S, print all the paths, starting from root, that sums upto the given sum. Path may not end on a leaf node.

		Example 1:

		Input : 
		sum = 8
		Input tree
		         1
		       /   \
		     20      3
		           /    \
		         4       15   
		        /  \     /  \
		       6    7   8    9      

		Output :
		1 3 4
		Explanation : 
		Sum of path 1, 3, 4 = 8.
*/

class Solution
{
    
    public static void pathSum(Node root,int currentSum,int sum,ArrayList<Integer> path,ArrayList<ArrayList<Integer>> arr){
        
        if(root == null )
            return;
        
        path.add(root.data);
        if(currentSum+root.data == sum)
            arr.add(new ArrayList<>(path));
        
        pathSum(root.left,currentSum+root.data,sum,path,arr);
        pathSum(root.right,currentSum+root.data,sum,path,arr);
        path.remove(path.size()-1);
        
    }
    
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        // code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> path=new ArrayList<>();
        
        pathSum(root,0,sum,path,arr);
        
        return arr;
    }
}
