/*
    39. Combination Sum

    Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

    The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

    The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
*/







class Solution {
    
    public static void backTrack(List<List<Integer>> result,List<Integer> list,int[] candidates,int target,int index){
        
        if(target < 0)
            return;
        else if(target == 0)
            result.add(new ArrayList<>(list));
        else{
            
            for(int i=index;i<candidates.length;i++){
                
                list.add(candidates[i]);
                backTrack(result,list,candidates,target-candidates[i],i);
                list.remove(list.size()-1);
            }
        }
    }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        
        backTrack(result,list,candidates,target,0);
        
        return result;
        
    }
}