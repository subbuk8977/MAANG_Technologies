/*
	136. Single Number
	Easy

	15997

	680

	Add to List

	Share
	Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

	You must implement a solution with a linear runtime complexity and use only constant extra space.
*/


class Solution {
    public int singleNumber(int[] nums) {
        
        int xor=0;
        
        for(int i:nums){
            
            xor=xor^i;
        }
        
        return xor;
    }
}