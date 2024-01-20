/*

	
	Day 3: Arrays

	Function Description

	Complete the getSecondLargest function in the editor below.

	getSecondLargest has the following parameters:

	---int nums[n]: an array of integers

	Returns

	---int: the second largest number in nums


*/


function getSecondLargest(nums) {
    // Complete the function
    
    let first=nums[0];
    let second=Math.min;
    let n=nums.length;
    for(let i=0;i<n;i++){
        
        if(nums[i] > first){
            
            second=first;
            first=nums[i];
        }
        
        if(nums[i] > second && first != nums[i])
            second=nums[i];
            
    }
    return second;
}