import java.util.*;

public class MaxProfit {

  public static int maxProfit(int prices[]) {
    int result = 0;
    int minPrice = Integer.MAX_VALUE, maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice)
        minPrice = prices[i];
      else if (prices[i] - minPrice > maxProfit)
        maxProfit = prices[i] - minPrice;
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
    int result = maxProfit(prices);
    System.out.println(result);
  }
}