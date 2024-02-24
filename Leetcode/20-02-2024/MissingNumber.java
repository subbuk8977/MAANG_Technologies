/*
	268. Missing Number
	Easy

	11551

	3281

	Add to List

	Share
	Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/


class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int sum=0;
        int nSum=n*(n+1)/2;
        
        for(int i:nums)
            sum+=i;
        
        return nSum-sum;
        
    }
}