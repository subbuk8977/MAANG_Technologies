/*
    22. Generate Parentheses
    Medium

    20472

    875

    Add to List

    Share
    Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
*/

class Solution {
    
    public void backtrack(List<String> list,int left,int right,String str,int n){
        
        if(str.length() == 2*n){
            
            list.add(str);
            return;
        }
        
        if(left < n)
            backtrack(list,left+1,right,str+'(',n);
        
        if(right < left)
            backtrack(list,left,right+1,str+')',n);
    }
    
    public List<String> generateParenthesis(int n) {
        
        List<String> list=new ArrayList<>();
        backtrack(list,0,0,"",n);
        
        return list;
    }
}