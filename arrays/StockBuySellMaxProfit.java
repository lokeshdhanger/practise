package com.demo.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * given an array of stock prices of each day.
 * find the maximum profit can be earned by buying and selling the stocks.
 * NOTE:
 * you at least one buy and sell the stocks.
 * to sell a stock you must first buy it.
 * 
 * 
 * 
 * time complexity: O(n)
 * 
 * @author xarvis
 *
 */
public class StockBuySellMaxProfit {
	
	static class Interval {
		int buy;
		int sell;
	}
	
	public static void main(String[] args) {
		
		int stocks[] = {100,180,260,310,40,535, 695};
		
		maxProfit(stocks, stocks.length);
		
	}
	
	public static void maxProfit(int [] stocks, int len) {

		//in this case buyer can buy only and can't sell
		if (len==1) {
			return;
		}
		
		List<Interval> solution = new ArrayList<>();
		int i=0;		
		int count=0;
		while (i<(len-1)) {
			
			while (i<(len-1) && (stocks[i]>=stocks[i+1])) {
				i++;
			}
			
			if (i==(len-1)) {
				break;
			}
			
			Interval interval = new Interval();
			
			interval.buy=i++;
			
			while ((i<len) && (stocks[i]>=stocks[i-1])) {
				i++;
			}
			
			interval.sell=i-1;

			solution.add(interval);
			count++;
		}
		
		int profit=0;
		if (count==0) {
			System.out.println("no profit");
		} else {
			for (int j = 0; j < count; j++) {
				System.out.println("buy on "+solution.get(j).buy+" day and sell on "+solution.get(j).sell+" day.");
				profit+=(stocks[solution.get(j).sell]-stocks[solution.get(j).buy]);
			}
			
			System.out.println("total profit "+profit);
		}

	}

}
