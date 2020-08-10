package com.nvn.stocks;
//Program to calculate maximum profit from a single
//and sell from the given stock list
public class StockTrade {

    int calculateMaxProfit(int stockPrices[]){

        int highestProfit = stockPrices[1] - stockPrices[0];
        int lowestStockPrice = stockPrices[0];

        for(int i =0 ; i<stockPrices.length;i++){
            if (( stockPrices[i] - lowestStockPrice ) > highestProfit){
                highestProfit = stockPrices[i] - lowestStockPrice;
            }

            if(stockPrices[i] < lowestStockPrice) {
                lowestStockPrice = stockPrices[i];
            }
        }
            return highestProfit;
    }

    public static void main(String[] args){
        StockTrade stockTrade = new StockTrade();
        int stockPriceList[] = {10,7,5,8,11,9};
        System.out.println("Max Profit : "+stockTrade.calculateMaxProfit(stockPriceList));
    }
}
