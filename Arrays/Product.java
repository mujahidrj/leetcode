import java.util.*;

public class Product {
  public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] arr = new int[n];
    int[] prefix = new int[n];
    int[] suffix = new int[n];

    prefix[0] = 1;
    suffix[n - 1] = 1;

    // Left to Right
    for (int i = 1; i < n; i++) {
      prefix[i] = nums[i - 1] * prefix[i - 1];
    }

    // Right to Left
    for (int i = n - 2; i >= 0; i--) {
      suffix[i] = nums[i + 1] * suffix[i + 1];
    }

    for (int i = 0; i < n; i++) {
      arr[i] = prefix[i] * suffix[i];
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] nums = new int[] { 1, 2, 3, 4 };
    int[] newArr = productExceptSelf(nums);
    for (int i : newArr)
      System.out.print(i + " ");
    System.out.println();

  }
}