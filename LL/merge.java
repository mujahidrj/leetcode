import java.util.*;

class node {
  int val;
  node next;

  node(int x) {
    val = x;
    next = null;
  }
}

public class merge {
  public node mergeTwoLists(node l1, node l2) {
    if (l1 == null)
      return l2;
    if (l2 == null)
      return l1;

    node n, ptr1 = l1, ptr2 = l2;
    if (ptr1.val <= ptr2.val) {
      n = new node(ptr1.val);
      ptr1 = ptr1.next;
    } else {
      n = new node(ptr2.val);
      ptr2 = ptr2.next;
    }

    while (ptr1 != null || ptr2 != null) {
      if (ptr1.val <= ptr2.val) {
        n.next = new node(ptr1.val);
        ptr1 = ptr1.next;
      } else {
        n.next = new node(ptr2.val);
        ptr2 = ptr2.next;
      }
    }

    if (ptr1 == null && ptr2 == null)
      return n;

    if (ptr1 == null) {
      while (ptr2 != null) {
        n.next = new node(ptr2.val);
        ptr2 = ptr2.next;
      }
    }
    if (ptr2 == null) {
      while (ptr1 != null) {
        n.next = new node(ptr1.val);
        ptr1 = ptr1.next;
      }
    }
    return n;

  }
}