/*

	
	Day 7: Regular Expressions I

	Task

	Complete the function in the editor below by returning a RegExp object, re , that matches any string s that begins and ends with the same vowel. Recall that the English vowels are a, e, i, o, and u.



*/


function regexVar() {
    /*
     * Declare a RegExp object variable named 're'
     * It must match a string that starts and ends with the same vowel (i.e., {a, e, i, o, u})
     */
    
    var re = /^[a].+[a]$|^[e].+[e]$|^[i].+[i]$|^[o].+$[o]|^[u].+$[u]/;  
    
    /*
     * Do not remove the return statement
     */
    return re;
}