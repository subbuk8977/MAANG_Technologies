
/*
	189. Rotate Array
	Medium

	17234

	1883

	Add to List

	Share
	Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
*/

class Solution {
    public void rotate(int[] nums, int k) {
        
        
        int n=nums.length;
        int r=k%n;
        
        int a=n-r;
        
        int newarr[]=new int[a];
        for(int i=0;i<a;i++)
            newarr[i]=nums[i];
        
        for(int i=0;i<r;i++)
            nums[i]=nums[a++];
        
        for(int i=r;i<n;i++)
            nums[i]=newarr[i-r];
        
        
        
    }
}