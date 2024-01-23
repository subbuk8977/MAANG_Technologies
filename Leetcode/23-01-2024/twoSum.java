/*  1.TwoSum :

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.
*/





class Solution {
    public int[] twoSum(int[] nums, int target) {

//      TWO_POINTER APPROACH : For sorted array

//         int arr[]=new int[2];
        
//         Arrays.sort(nums);
        
//         int start=0;
//         int end=nums.length-1;
        
//         while(start<end){
            
//             int sum=nums[start]+nums[end];
//             if(sum == target){
                
//                 arr[0]=start;
//                 arr[1]=end;
                
//                 break;
//             }
//             else if(sum < target)
//                 start++;
//             else
//                 end--;
//         }
        
//         return arr;
        
        
        int arr[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int remain=target-nums[i];
            if(map.containsKey(remain)){
                
                arr[0]=map.get(remain);
                arr[1]=i;
                return arr;
            }
            
            map.put(nums[i],i);
        }
        
        return arr;
        
    }
}