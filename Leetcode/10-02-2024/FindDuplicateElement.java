

/*
	287. Find the Duplicate Number
	
	Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

*/




class Solution {
    public int findDuplicate(int[] nums) {
        
        int n=nums.length;
        
        HashSet<Integer> st=new HashSet<>();
        for(int i:nums){
            
            if(!st.contains(i)){
                
                st.add(i);
            }
            else
                return i;
        }
        
        return -1;
            
        
    }
}