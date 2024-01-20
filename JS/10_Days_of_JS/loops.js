/*
    
    Day 2: Loops
    
    Task

   1. First, print each vowel s in  on a new line. The English vowels are a, e, i, o, and u, and each vowel must be printed in the same order as it appeared in s.
    2. Second, print each consonant (i.e., non-vowel) in  on a new line in the same order as it appeared in s.

*/

function vowelsAndConsonants(s) {
    
    let str="aeiou";
    
    let vowel="";
    let consonent="";
    
    for(let i of s){
        
        if (str.indexOf(i)!=-1){
            vowel+=i;
        }
        else{
            consonent+=i;
        }
    }
    
    for(let i of vowel){
        console.log(i);
    }
    
    for(let i of consonent)
        console.log(i);
}