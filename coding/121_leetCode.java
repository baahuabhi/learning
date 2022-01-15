class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int buyingIndex = 0;
            for (int i=1;i<prices.length;i++) {
               if(prices[i]  - prices [buyingIndex] > maxProfit ){
                   maxProfit = prices[i]  - prices [buyingIndex];
               }
                if(prices[i] < prices[buyingIndex]){
                    buyingIndex = i;
                }
           }
            return maxProfit;
        }
}
