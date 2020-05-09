import java.util.*;

// Uses Binary Search to determine if a number is a perfect square 
public class day8 {
  public boolean isPerfectSquare(int num) {
    if (num == 0 || num == 1)
      return true;

    long low = 1, high = num / 2, mid = 0;

    long nums = (long) num;

    while (low <= high) {
      mid = low + (high - low) / 2;
      long val = mid * mid;
      if (val == nums)
        return true;
      else if (val < nums)
        low = mid + 1;
      else
        high = mid - 1;
    }
    return false;
  }
}