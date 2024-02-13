
/*

	169. Majority Element
	Easy

	18436

	570

	Add to List

	Share
	Given an array nums of size n, return the majority element.

	The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


*/


class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i: nums){
            
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int n=nums.length;
        for( Map.Entry<Integer, Integer> it : map.entrySet()){
            
            if(it.getValue() > n/2)
                return it.getKey();
        }
        return -1;
    }
}