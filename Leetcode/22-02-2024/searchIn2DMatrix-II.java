/*
	
	240. Search a 2D Matrix II
	Medium

	11611

	195

	Add to List

	Share
	Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

	Integers in each row are sorted in ascending from left to right.
	Integers in each column are sorted in ascending from top to bottom.

*/




class Solution {
    
    public boolean binarySearch(int[] arr,int target){
        
        int start=0;
        int end=arr.length-1;
        
        while(start <= end){
            
            int mid=(start + end)/2;
            if(arr[mid] == target)
                return true;
            else if(arr[mid] > target)
                end--;
            else
                start++;
            
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int arr[] : matrix){
            
            if(binarySearch(arr,target))
                return true;
        }
        return false;
        
        
    }
}