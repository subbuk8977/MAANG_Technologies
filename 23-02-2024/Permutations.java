/*
	46. Permutations
	Medium

	18575

	313

	Add to List

	Share
	Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
*/


class Solution {
    
    public void backtrack(List<List<Integer>> result,List<Integer> list,int[] nums,boolean visit[]){
        
        if(list.size() == nums.length){
            
            result.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!visit[i]){
                
                visit[i]=true;
                list.add(nums[i]);
                backtrack(result,list,nums,visit);
                visit[i]=false;
                list.remove(list.size()-1);
                
            }
            
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        
        boolean visit[]=new boolean[nums.length];
        backtrack(result,list,nums,visit);
        
        return result;
        
    }
}