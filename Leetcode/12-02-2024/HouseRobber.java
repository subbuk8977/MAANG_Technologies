
/*


	198. House Robber
	Medium

	20461

	403

	Add to List

	Share
	You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

	Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police


*/



class Solution {
    public int rob(int[] nums) {
        
        int n=nums.length;
        int dp[]=new int[n];
        
        dp[0]=nums[0];
        
        for(int i=1;i<n;i++){
            
            int one=dp[i-1];
            int two=nums[i];
            if(i>1){
                
                two+=dp[i-2];
            }
            
            dp[i]=Math.max(one,two);
        }
        
        return dp[n-1];
        
    }
}