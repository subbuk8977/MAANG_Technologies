

/*
	72. Edit Distance :

	Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

	You have the following three operations permitted on a word:

	-Insert a character
	-Delete a character
	-Replace a character

*/


class Solution {
    public int minDistance(String word1, String word2) {
        
        
        int m=word1.length();
        int n=word2.length();
        
        int dp[][]=new int[m+1][n+1];
        
        for(int i=0;i<=m;i++)
            dp[i][0]=i;
        
        for(int i=0;i<=n;i++)
            dp[0][i]=i;
        
        
        for(int i=1;i<=m;i++){
            
            for(int j=1;j<=n;j++){
                
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else{
                    
                    int one=dp[i-1][j-1]+1;
                    int two=dp[i-1][j]+1;
                    int three=dp[i][j-1]+1;
                    
                    dp[i][j]=Math.min(one,Math.min(two,three));
                }
                    
            }
        }
        
        return dp[m][n];
     
        
    }
}