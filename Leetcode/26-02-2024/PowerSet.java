

/*
	PowerSet:
	
	Given a string s of length n, find all the possible subsequences of the string s in lexicographically-sorted order.
	}
*/


class Solution
{
    
    public void solve(String s,String ans,List<String> a){
        if(s.length() == 0){
            
            if(!ans.equals("")){
                
                a.add(ans);

            }
            return;
        }
        
        char ch=s.charAt(0);
        String st=s.substring(1);
        
        solve(st,ans,a);
        solve(st,ans+ch,a);
        
        return;
    }
    
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        
        List<String> list=new ArrayList<>();
        solve(s,"",list);
        
        Collections.sort(list);
        
        return list;
    }
}