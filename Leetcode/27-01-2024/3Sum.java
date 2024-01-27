/*
	
	15. 3Sum:

	Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

	Notice that the solution set must not contain duplicate triplets.

*/




class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        
        int n=nums.length;
        Arrays.sort(nums);
        
        
        for(int i=0;i<n;i++){
            
            if(i>0 && nums[i] == nums[i-1])
                continue;
            
            int j=i+1;
            int k=n-1;
            
            while(j<k){
                
                int sum=nums[i]+nums[j]+nums[k];
                
                if(sum < 0)
                    j++;
                else if(sum > 0)
                    k--;
                else{
                    
                    List<Integer> arr=new ArrayList<>();
                    
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    
                    ans.add(arr);
                    
                    j++;
                    k--;
                    
                    while(j<k && nums[j] == nums[j-1])
                        j++;
                    
                    while(j<k && nums[k] == nums[k+1])
                        k--;
                }
            }
        }
        
        return ans;
        
    }
}
