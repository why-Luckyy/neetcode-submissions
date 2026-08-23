class Solution {
    public int maxProfit(int[] prices) {
        int minE = prices[0];
        int maxD = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++) {
            if(minE > prices[i]) minE = prices[i];
            maxD = Math.max(maxD, prices[i] - minE);
        }
        return maxD;
    }
}