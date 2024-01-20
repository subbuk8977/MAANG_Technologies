
/*
	
	Day 0: Data Types
	Task

	Variables named , , and  are declared for you in the editor below. You must use the  operator to perform the following sequence of operations:

	1.Convert  to an integer (Number type), then sum it with  and print the result on a new line using console.log.
	2.Convert  to a floating-point number (Number type), then sum it with  and print the result on a new line using console.log.
	3.Print the concatenation of  and  on a new line using console.log. Note that  must be printed first.

*/

function performOperation(secondInteger, secondDecimal, secondString) {
    // Declare a variable named 'firstInteger' and initialize with integer value 4.
    const firstInteger = 4;
    
    // Declare a variable named 'firstDecimal' and initialize with floating-point value 4.0.
    const firstDecimal = 4.0;
    
    // Declare a variable named 'firstString' and initialize with the string "HackerRank".
    const firstString = 'HackerRank ';
    
    
    const a=Number(firstInteger)+Number(secondInteger);
    const b=Number(firstDecimal)+Number(secondDecimal);
    const c=firstString+secondString;
    
    console.log(a);
    console.log(b);
    console.log(c);
}