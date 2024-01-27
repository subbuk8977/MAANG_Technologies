
/* 
    
    2367. Number of Arithmetic Triplets :

    You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

    i < j < k,
    nums[j] - nums[i] == diff, and
    nums[k] - nums[j] == diff.
    Return the number of unique arithmetic triplets.

*/






class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
            map.put(nums[i],i);
        
        
        for(int i=0;i<n;i++){
            
            
            if(map.containsKey(nums[i] + diff) && map.containsKey(nums[i]+diff+diff))
                count++;
        }
        
        return count;
    }
}