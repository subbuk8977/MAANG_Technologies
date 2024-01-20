
/*

	Day 1: Let and Const

	Task

	1.Declare a constant variable, PI, and assign it the value Math.PI. You will not pass this challenge unless the variable is declared as a constant and named PI (uppercase).
	2.Read a number,r , denoting the radius of a circle from stdin.
	3.Use PI and r to calculate the  and  of a circle having radius .
	4.Print area as the first line of output and print perimeter  as the second line of output.


*/

function main() {
    // Write your code here. Read input using 'readLine()' and print output using 'console.log()'.

    let value=readLine();
    let radius=Number(value);
    // Print the area of the circle:
    let area=Math.PI*(radius*radius);
    // Print the perimeter of the circle:
    let perimeter=2*Math.PI*radius;
    
    console.log(area);
    console.log(perimeter);
  }