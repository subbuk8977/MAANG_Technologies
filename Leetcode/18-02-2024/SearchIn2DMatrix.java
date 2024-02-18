/*

	74. Search a 2D Matrix
	Medium

	15239

	402

	Add to List

	Share
	You are given an m x n integer matrix matrix with the following two properties:

	Each row is sorted in non-decreasing order.
	The first integer of each row is greater than the last integer of the previous row.
	Given an integer target, return true if target is in matrix or false otherwise.

	You must write a solution in O(log(m * n)) time complexity.

*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        boolean result=false;
        for(int[] arr:matrix){
            
            result=binarySearch(arr,target);
            if(result)
                return true;
        }
        return false;
        
    }
    
    public boolean binarySearch(int[] arr,int target){
        
        int start=0;
        int end=arr.length-1;
        
        while(start <= end){
            
            int mid=(start + end)/2;
            
            if(arr[mid] == target)
                return true;
            else if(arr[mid] > target)
                end=mid-1;
            else
                start=mid+1;
        }
        return false;
    }
}