





/*	

	78. Subsets :

	Given an integer array nums of unique elements, return all possible subsets (the power set).

	The solution set must not contain duplicate subsets. Return the solution in any order.

*/

class Solution {
    
    
    public void backtrack(List<List<Integer>> result,List<Integer> list,int[] nums,int index){
        
        if(index == nums.length){
            
            result.add(new ArrayList<>(list));
            
            return;
            
        }
        
        list.add(nums[index]);
        backtrack(result,list,nums,index+1);
        list.remove(list.size()-1);
        backtrack(result,list,nums,index+1);
        
        
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        
        List<Integer> list=new ArrayList<>();
        
        backtrack(result,list,nums,0);
        
        return result;
        
    }
}