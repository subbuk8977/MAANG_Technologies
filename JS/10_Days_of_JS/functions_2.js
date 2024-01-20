/*


	Day 5: Arrow Functions

	Task

	Complete the function in the editor. It has one parameter: an array  nums . It must iterate through the array performing one of the following actions on each element:

	1.If the element is even, multiply the element by 2.
	2.If the element is odd, multiply the element by 3 .
	The function must then return the modified array.



*/

function modifyArray(nums) {
    
    for(let i =0;i<nums.length;i++)
        nums[i]=(nums[i] % 2== 0)?nums[i]*2 : nums[i]*3;
    
    return nums;
}