/*
	128. Longest Consecutive Sequence
	Medium

	19255

	922

	Add to List

	Share
	Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

	You must write an algorithm that runs in O(n) time.
*/


class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);
        
        int maxCount=0;
        
        int sum=1;
        
        int n=nums.length;
        
        for(int i=0;i<nums.length;i++){
            
            if(i>0 && nums[i] == nums[i-1]+1)
                sum++;
            
            else if( i>0 && nums[i] == nums[i-1])
                continue;
            else{
                
                maxCount=Math.max(maxCount,sum);
                sum=1;
            }
        }
        
        return n==0?0:Math.max(maxCount,sum);
        
    }
}