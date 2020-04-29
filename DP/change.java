package DP;

import java.util.*;

// Given an integer representing a given amount of change, write a
// function to compute the total number of coins required to make
// that amount of change. You can assume that there is always a
// 1¢ coin.
// eg. (assuming American coins: 1, 5, 10, and 25 cents)
// makeChange(1) = 1 (1)
// makeChange(6) = 2 (5 + 1)
// makeChange(49) = 7 (25 + 10 + 10 + 1 + 1 + 1 + 1)
public class change {

  // Greedy Recursive solution that doesn't always work
  public static int makeChange(int n) {
    if (n >= 25)
      return 1 + makeChange(n - 25);
    if (n >= 10)
      return 1 + makeChange(n - 10);
    if (n >= 5)
      return 1 + makeChange(n - 5);

    return n;
  }

  public static int makeChangeMemo(int n, int[] coins) {
    int[] arr = new int[n + 1];
    Arrays.fill(arr, -1);
    return makeChangeMemo(n, arr, coins);
  }

  public static int makeChangeMemo(int n, int[] cache, int[] coins) {
    int result = Integer.MAX_VALUE;

    if (n == 0)
      return 0;

    if (cache[n] != -1) {
      return cache[n];
    }

    for (int c : coins)
      if (n - c >= 0)
        result = Math.min(result, 1 + makeChangeMemo(n - c, cache, coins));

    return result;
  }

  public static int makeChangeDP(int n, int[] coins) {
    int[] arr = new int[n + 1];

    Arrays.fill(arr, Integer.MAX_VALUE);

    arr[0] = 0;

    for (int i = 1; i < arr.length; i++) {

      for (int c : coins)
        if (i - c >= 0)
          arr[i] = Math.min(arr[i], 1 + arr[i - c]);

    }

    return arr[n];
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 6, 10 };

    System.out.println(makeChangeDP(18, arr));
  }

}