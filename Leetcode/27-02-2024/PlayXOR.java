
/*
	Play_With_XOR :

	You are given an array arr[] of length n, you have to re-construct the same array arr[] in-place. The arr[i] after reconstruction will become arr[i] OR arr[i+1], where OR is bitwise or. If for some i, i+1 does not exists, then do not change arr[i].

*/

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        
        int ans[]=new int[n];
        
        for(int i=0;i<n-1;i++)
            ans[i]=arr[i] | arr[i+1];
        
        ans[n-1]=arr[n-1];
        
        return ans;
    }
    
    
}



