class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = 0; 
        int r = 1;

        while(r < prices.length){
            int buy = prices[l];
            int sell = prices[r];
            if(sell - buy <= 0 && l + 1 <= r){
                l++;
            } else {
                r++;
                max = Math.max(sell - buy, max);
            }
        }

        return max;
    }
}
