import java.util.*;

public class day5 {
  public static int firstUniqChar(String s) {
    int[] freq = new int[26];
    char[] s2 = s.toCharArray();
    for (char c : s2)
      freq[c - 'a']++;
    for (int i = 0; i < s2.length; i++)
      if (freq[s2[i] - 'a'] == 1)
        return i;
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(firstUniqChar("cc"));
  }
}