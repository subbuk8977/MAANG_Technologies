
/*	
	283. Move Zeroes :

	Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

	Note that you must do this in-place without making a copy of the array.

*/



class Solution {
    public void moveZeroes(int[] nums) {
        
        int start=0;
        int mid=0;
        
        int n=nums.length;
        
        while(mid < n){
            
            if(nums[mid] == 0){
                
                mid++;
            }
            else{
                
                int temp=nums[start];
                nums[start]=nums[mid];
                nums[mid]=temp;
                
                start++;
                mid++;
            }
        }
        
    }
}