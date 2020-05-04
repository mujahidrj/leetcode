import java.util.*;

public class day4 {
  public static int bitwiseComplement(int n) {
    if (n == 0)
      return 1;
    int numBits = (int) (Math.log(n) / Math.log(2)) + 1;
    int result = 0;

    result = n ^ (int) (Math.pow(2, numBits) - 1);

    return result;
  }

  public static void main(String[] args) {
    System.out.println(bitwiseComplement(10));
  }
}