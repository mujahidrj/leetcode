package SetsAndMaps;

import java.util.*;

// In academia, the h-index is a metric used to calculate the impact of a researcher's papers. It is calculated as follows:
// A researcher has index h if at least h of her N papers have h citations each. If there are multiple h satisfying this formula, the maximum is chosen.
// For example, suppose N = 5, and the respective citations of each paper are [4, 3, 0, 1, 5]. Then the h-index would be 3, since the researcher has 3 
// papers with at least 3 citations.
// Given a list of paper citations of a researcher, calculate their h-index.
public class hindex {

  public static int h(int[] citations, int n) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = citations[0];
    int hindex = 0;

    // Stores all the values in a HashMap
    for (int i : citations) {

      // If it's the first time seeing the number, add it to the map
      if (!map.containsKey(i)) {
        map.put(i, 0);
      }

      // Increment that number and all numbers lower than it by 1
      for (int j = i; j >= 0; j--) {
        if (!map.containsKey(j))
          map.put(j, 1);
        else
          map.put(j, map.get(j) + 1);
      }

    }

    // Start from the back and break when you find the first instance of where i
    // papers have a value of i or greater
    for (int i = max; i >= 0; i--) {
      if (map.containsKey(i)) {
        if (map.get(i) >= i) {
          hindex = map.get(i);
          break;
        }
      }
    }
    return hindex;
  }

  public static void main(String[] args) {
    int[] citations = { 4, 3, 0, 1, 5 };

    System.out.println("h-index: " + h(citations, citations.length));

  }
}
