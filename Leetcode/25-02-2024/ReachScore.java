
/*
	Reach a given score

	Consider a game where a player can score 3 or 5 or 10 points in a move. Given a total score n, find number of distinct combinations to reach the given score.
*/



class Geeks {
    public long count(int n) {
        // Add your code here.
        
        long arr[]=new long[n+1];
        
        arr[0]=1;
        
        for(int i=3;i<=n;i++)
            arr[i]+=arr[i-3];
        
        for(int i=5;i<=n;i++)
            arr[i]+=arr[i-5];
            
        for(int i=10;i<=n;i++)
            arr[i]+=arr[i-10];
        
        return arr[n];
        
        
    }
}