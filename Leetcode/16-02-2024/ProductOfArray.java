/*
	238. Product of Array Except Self
	Medium

	21320

	1289

	Add to List

	Share
	Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

	The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

	You must write an algorithm that runs in O(n) time and without using the division operation.
*/








class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;
        
        int lprod[]=new int[n];
        int rprod[]=new int[n];
        
        lprod[0]=1;
        
        for(int i=1;i<n;i++)
            lprod[i]=lprod[i-1]*nums[i-1];
        
        rprod[n-1]=1;
        
        for(int i=n-2;i>=0;i--)
            rprod[i]=rprod[i+1]*nums[i+1];
        
        
        int newarr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            newarr[i]=lprod[i]*rprod[i];
        }
        
        return newarr;
        
    }
}