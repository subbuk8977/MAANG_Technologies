
// Count Set Bits :
// Write a program to count the number of 1's in the binary representation of an integer.




import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.

		int count=0;
		while(n>0){

			count += n&1;
			n>>=1;

		}
			
		return count;
	}
}