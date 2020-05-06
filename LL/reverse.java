import java.util.*;

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class reverse {
  public static ListNode reverseList(ListNode head) {
    ListNode newHead = null;
    while (head != null) {
      ListNode temp = head.next;
      head.next = newHead;
      newHead = head;
      head = temp;
    }
    return newHead;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = new ListNode(4);
    ListNode e = new ListNode(5);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = null;
    // ListNode temp = a;
    // while (temp != null) {
    // System.out.println(temp.val);
    // temp = temp.next;
    // }
    ListNode newHead = reverseList(a);
    ListNode temp = newHead;
    while (temp != null) {
      System.out.println(temp.val);
      temp = temp.next;
    }

  }
}
