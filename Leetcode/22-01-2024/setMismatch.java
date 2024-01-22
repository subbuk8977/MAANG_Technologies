/*

	Leetcode POTD : SetMismatch

	You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

	You are given an integer array nums representing the data status of this set after the error.

	Find the number that occurs twice and the number that is missing and return them in the form of an array.

	 

	Example 1:

	Input: nums = [1,2,2,4]
	Output: [2,3]
*/


class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int arr[]=new int[2];
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int sum=0;
        for(int i:nums){
            
            sum+=i;
            if(map.containsKey(i)){
                arr[0]=i;
            }
            map.put(i,map.getOrDefault(i,0)+1);
                
        }
        
        int n=nums.length;
        int nSum=(n*(n+1))/2;
        arr[1]=nSum-(sum-arr[0]);
        
        return arr;
    }
}