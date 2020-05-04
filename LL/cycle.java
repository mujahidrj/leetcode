import java.util.*;

class node {
  int val;
  node next;

  node(int x) {
    val = x;
    next = null;
  }
}

public class cycle {
  public static boolean hasCycle(node head) {
    HashSet<node> set = new HashSet<>();
    while (head != null) {
      if (set.contains(head)) {
        return true;
      } else {
        set.add(head);
        head = head.next;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    node n = new node(3);
    n.next = new node(4);
    System.out.println(n.next.val);
  }
}