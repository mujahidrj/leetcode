import java.util.*;

public class twosum {
  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.get(target - nums[i]) != null) {
        return new int[] { map.get(target - nums[i]), i };
      }
      map.put(nums[i], i);
    }
    return new int[2];
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 2, 7, 11, 15 };
    int target = 9;
    int[] newArr = twoSum(arr, target);

    for (int i : newArr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}