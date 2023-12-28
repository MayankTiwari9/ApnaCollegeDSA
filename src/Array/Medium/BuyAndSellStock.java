package Array.Medium;

public class BuyAndSellStock {
    public static int buyAndSell(int[] prices){
        int maxProfit = 0;

        //Optimised Solution :- TC O(n) SC O(1)
        int minSoFar = prices[0];

        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }



        //Naive Solution :- TC O(n^2) SC O(1)
        // for (int i = 0; i < prices.length; i++) {
        //     for (int j = i+1; j < prices.length; j++) {
        //         if(prices[j] > prices[i]){
        //             int sum = prices[j] - prices[i];
        //             maxProfit = Math.max(maxProfit, sum);
        //         }
        //     }
        // }

        return maxProfit;

    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(buyAndSell(prices));
    }
}
