class Solution {
    public int maxProfit(int[] prices) {
        // 121
        // Edge cases
        if (prices == null || prices.length <= 0) return 0;

        // The object is to buy low and sell high so...
        // We need to keep track of the min value 
        // We need to keep track of the max profit which will be the answer
        int min_value = Integer.MAX_VALUE;
        int max_profit = 0;

        // We iterate through every price in the array
        for (int price : prices) {
            // If the price is lower than the min_value, replace the price to the min_value
            // so it will keep track of the lowest value
            if (price < min_value) min_value = price;
            
            // replace the max_profit with the value. We want the largest value
            max_profit = Math.max(max_profit, price - min_value);
        }

        // We return the largest profit.
        return max_profit;
    }
}
