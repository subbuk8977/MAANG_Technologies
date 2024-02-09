

/*
	560. Subarray Sum Equals K

	Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

	A subarray is a contiguous non-empty sequence of elements within an array.



*/



class Solution {
    
    public int subarraySum(int[] nums, int k) {
        
        
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        
        
        int count=0;
        int preSum=0;
        
        for(int i=0;i<n;i++){
            
            preSum+=nums[i];
            
            int remain=preSum-k;
            
            count+=map.getOrDefault(remain,0);
            
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        
        return count;
        
    }
}