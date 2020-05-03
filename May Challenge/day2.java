import java.util.*;

public class day2 {
  public int numJewelsInStones(String J, String S) {
    int counter = 0;
    HashSet<Character> set = new HashSet<>();
    for (Character c : J.toCharArray()) {
      if (!set.contains(c))
        set.add(c);
    }
    for (Character c : S.toCharArray()) {
      if (set.contains(c))
        counter++;
    }
    return counter;
  }
}