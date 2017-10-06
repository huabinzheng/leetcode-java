package leetcode;
public class Solution {
	public static int maxProfit(int[] prices) {
        int days = prices.length;
        if (days == 0 || days == 1) return 0;
        int[] buy = new int[days];
        int[] sell = new int[days];
        buy[0] = -prices[0]; 
        sell[0] = 0;
        buy[1] = Math.max(-prices[0], -prices[1]); 
        sell[1] = Math.max(0, prices[1] - prices[0]);
        for (int i = 2; i < days; i++) {
        	buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);
        	sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);		
        }
        return Math.max(buy[days - 1], sell[days - 1]);
    }
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 0, 2};
		System.out.println(maxProfit(prices));
	}
}
