class Solution {
    public int maxProfit(int[] prices) {
         int n=prices.length;
        int profit=0;
        int buy=prices[0];

        for(int j=1;j<n;j++){

            int currprofit= prices[j]-buy;
            if(currprofit>profit){
                profit=currprofit;
            }
            if(prices[j]<buy){
            buy=prices[j];
            }

        }
        return profit;
    }
        
    }
