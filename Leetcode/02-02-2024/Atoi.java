


/*
	GFG POTD :: Implement Atoi
	

	Given a string, s, the objective is to convert it into integer format without utilizing any built-in functions. If the conversion is not feasible, the function should return -1.

	Note: Conversion is feasible only if all characters in the string are numeric or if its first character is '-' and rest are numeric.

 */               
                
                
                
//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	// Your code here
	
	    int num=0;
	    boolean neg=false;
	    
	    int i=0;
	    if(s.charAt(i) == '-' ){
	        
	        neg=true;
	        i++;
	    }
	    
	    
	    int n=s.length();
	    
	    while(i<n){
	        
	        int val=s.charAt(i)-'0';
	        if(val>=0 && val<=9){
	            
	            num=num*10+val;
	            i++;
	        }
	        
	        else
	            return -1;
	        
	    }
	    
	    return (neg)?-num:num;
	
    }
}
