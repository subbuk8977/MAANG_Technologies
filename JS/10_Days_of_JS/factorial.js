/*

	Day 1: Functions


	Task

	Implement a function named factorial that has one parameter: an integer n, . It must return the value of n! (i.e.,  factorial).

	Input Format

	Locked stub code in the editor reads a single integer, , from stdin and passes it to a function named factorial.

	Constraints

		1<=n<=10

	Output Format

	The function must return the value of n!.


*/

function factorial(n){
    
    if(n<=1)
        return 1;
    
    return n*factorial(n-1);
}