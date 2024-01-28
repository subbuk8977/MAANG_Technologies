

/*
    34. Find First and Last Position of Element in Sorted Array

    Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

    If target is not found in the array, return [-1, -1].

    You must write an algorithm with O(log n) runtime complexity.
*/




class Solution {
    
    
    public static int firstPos(int[] nums,int target){
        
        int pos=-1;
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            
            int mid=(start+end)/2;
            
            if(nums[mid] == target){
                
                pos=mid;
                end--;
            }
            else if(nums[mid] > target)
                end--;
            else
                start++;
        }
        return pos;
    }
    
    public static int lastPos(int[] nums,int target){
        
        int pos=-1;
        int start=0;
        int end=nums.length-1;
        
        while(start<=end){
            
            int mid=(start+end)/2;
            
            if(nums[mid] == target){
                
                pos=mid;
                start++;
            }
            else if(nums[mid] > target)
                end--;
            else
                start++;
        }
        return pos;
    }
    
    public int[] searchRange(int[] nums, int target) {
        
        int arr[]=new int[2];
        arr[0]=firstPos(nums,target);
        arr[1]=lastPos(nums,target);
        
        return arr;
        
    }
}