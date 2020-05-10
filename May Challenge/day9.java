import java.util.*;

public class day9 {
  public int findJudge(int n, int[][] trust) {

    if (trust.length < n - 1) {
      return -1;
    }

    int freq[] = new int[n + 1];
    int numTrusted[] = new int[n + 1];

    for (int i = 0; i < trust.length; i++) {
      int person1 = trust[i][0];
      int person2 = trust[i][1];
      freq[person2]++;
      numTrusted[person1]++;
    }

    // Checking if any person is trusted by everyone and doesn't trust anyone
    for (int i = 1; i < freq.length; i++)
      if (freq[i] == n - 1 && numTrusted[i] == 0)
        return i;

    return -1;
  }
}