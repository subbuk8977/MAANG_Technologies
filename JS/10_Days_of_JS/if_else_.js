/*

	Day 2: Conditional Statements: Switch

	Task

	Complete the getLetter(s) function in the editor. It has one parameter: a string, , consisting of lowercase English alphabetic letters (i.e., a through z). It must return A, B, C, or D depending on the following criteria:

	If the first character in s string  is in the set {aeiou} then return A.
	If the first character in s string  is in the set {bcdfg} then return B.
	If the first character in s string  is in the set {hjklm} then return C.
	If the first character in s string  is in the set  then return D.
	Hint: You can get the letter at some index  in  using the syntax s[i] or s.charAt(i).


*/


function getLetter(s) {
    let letter;
    // Write your code here
    
    let set1="aeiou";
    let set2="bcdfg";
    let set3="hjklm";
    
    if(set1.indexOf(s.charAt(0)) != -1)
        letter="A";
    else if(set2.indexOf(s.charAt(0)) != -1)
        letter="B";
    else if(set3.indexOf(s.charAt(0)) != -1)
        letter="C";
    else
        letter="D";
    
    return letter;
}