package com.example.p_121_besttimetobuy;

public class ShareProfit {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0; i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else if((prices[i]-min)>profit){
                profit = prices[i]-min;
            }
        }
        return profit;
    }

    public static void main(String[] args) {

    }
}
