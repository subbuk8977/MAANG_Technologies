
/*

	54. Spiral Matrix

	Given an m x n matrix, return all elements of the matrix in spiral order.


*/


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        int lcol=0,lrow=0;
        int ucol=m-1,urow=n-1;

        int total=m*n;
        int count=0;
        List<Integer> ans=new ArrayList<>();

        while(count <total && (lcol<=ucol && lrow<=urow))
        {
            for(int i=lcol;i<=ucol && count<total;i++)
            {
                ans.add(matrix[lrow][i]);
                count++;
            }
            lrow++;

            for(int i=lrow;i<=urow && count<total;i++)
            {
                ans.add(matrix[i][ucol]);
                count++;
            }
            ucol--;

            for(int i=ucol;i>=lcol && count<total;i--)
            {
                ans.add(matrix[urow][i]);
                count++;
            }
            urow--;

            for(int i=urow;i>=lrow && count<total;i--)
            {
                ans.add(matrix[i][lcol]);
                count++;
            }
            lcol++;
        }
        return ans;
        
    }
}