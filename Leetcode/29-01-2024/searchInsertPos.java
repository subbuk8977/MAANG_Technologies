/*
	35. Search Insert Position :

	Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

	You must write an algorithm with O(log n) runtime complexity.

*/








class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                ans = mid + 1;
                start = mid + 1;
            }
        }
        return ans;
    }
}