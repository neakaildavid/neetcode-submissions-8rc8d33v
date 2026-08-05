class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int maxProf = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < prices[buy]){
                buy = i;
            }
            sell = i;
            int newProf = prices[sell] - prices[buy];
            if(newProf > maxProf){
                maxProf = newProf;
            }
        }
        return maxProf;
        
    }
}
