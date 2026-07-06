class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0]; 
        int sell = prices[0];
        PriorityQueue<Integer> total = new PriorityQueue<>(Collections.reverseOrder());
        total.add(sell-buy);
        for(int i = 1; i < prices.length; i++){ 
            if(prices[i] > sell){ 
                sell = prices[i]; 
                total.add(sell-buy);
            }
            if(buy > prices[i]){ 
                buy = prices[i]; 
                sell = 0;
            }
        }
        if(total.peek() > 0) return (int) total.poll(); 
        return 0;
    }
}
