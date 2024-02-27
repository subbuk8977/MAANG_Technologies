

/*
	Patternify:
	
	Problem statement :

	You are given an integer ‘N’. Your task is to print a pattern with the following description

	The pattern will consist of ‘N’ lines.

	For 1 <= ‘i’ <= ‘N’ ‘i’th line consists of a string of ‘N’  + 1 - ‘i’  ‘*’ characters.
	For example:

	If ‘N’ is 5 then the pattern will be.

	*****
	****
	***
	**
	*

*/




import java.util.* ;
import java.io.*; 

public class Solution {
	public static String[] printPatt(int n) {

		// Write your code here

		String arr[]=new String[n];

		String str="";
		for(int i=1;i<=n;i++)
			str+="*";
		
		for(int i=0;i<n;i++){

			arr[i]=str.substring(0,n-i);
		}

		return arr;


	}

}
