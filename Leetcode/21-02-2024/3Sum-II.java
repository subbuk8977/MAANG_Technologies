/*
	16. 3Sum Closest
	Medium

	10225

	545

	Add to List

	Share
	Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

	Return the sum of the three integers.

	You may assume that each input would have exactly one solution.

*/


class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);   
        
        int ans=nums[0]+nums[1]+nums[2];
        
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            
            // if(i>0 && nums[i] == nums[i-1])
            //     continue;
            
            int j=i+1;
            int k=n-1;
            
            while(j<k){
                
                int sum=nums[i]+nums[j]+nums[k];
                
                if(Math.abs(target-sum) < Math.abs(target-ans))
                    ans=sum;
                
                if(sum>target)
                    k--;
                else
                    j++;
            }
        }
        
        return ans;
        
    }
}