import java.util.*;

public class day7 {
  public boolean isCousins(TreeNode root, int x, int y) {
    int[] xData = search(root, x, root.val, 0);
    int[] yData = search(root, y, root.val, 0);
    return (xData[0] != yData[0]) && (xData[1] == yData[1]);
  }

  // returns [parent value, level]
  private int[] search(TreeNode root, int value, int parentVal, int level) {
    if (root == null)
      return new int[] { -1, -1 };
    if (root.val == value)
      return new int[] { parentVal, level };
    int[] left = search(root.left, value, root.val, level + 1);
    int[] right = search(root.right, value, root.val, level + 1);
    return left[0] == -1 ? right : left;
  }
}