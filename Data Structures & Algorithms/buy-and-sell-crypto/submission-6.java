class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minBuy = prices[0];

        for(int sell : prices){
            max = Math.max(sell - minBuy, max);
            minBuy = Math.min(minBuy, sell);
        }

        return max;
    }
}
