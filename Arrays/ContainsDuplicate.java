import java.util.*;

public class ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();

    for (int i : nums) {
      if (set.contains(i))
        return true;
      set.add(i);
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 1 };

    System.out.println(containsDuplicate(arr));
  }
}