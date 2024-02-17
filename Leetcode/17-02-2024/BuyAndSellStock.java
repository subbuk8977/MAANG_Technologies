/*
	121. Best Time to Buy and Sell Stock
	Easy

	29927

	1067

	Add to List

	Share
	You are given an array prices where prices[i] is the price of a given stock on the ith day.

	You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

	Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/


class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice=Integer.MAX_VALUE;
        int maxProduct=0;
        
        for(int i=0;i<prices.length;i++){
            
            minPrice=Math.min(minPrice,prices[i]);
            maxProduct=Math.max(maxProduct,prices[i]-minPrice);
        }
        
        return maxProduct;
        
    }
}