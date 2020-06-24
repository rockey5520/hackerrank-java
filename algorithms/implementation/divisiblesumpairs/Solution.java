package implementation.divisiblesumpairs;

public class Solution {

  static int divisibleSumPairs(int n, int k, int[] ar) {
    int pairs = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 1; j < n; j++) {
        if (i < j && (ar[i] + ar[j]) % k == 0) {
          pairs++;
        }
      }
    }

    return pairs;
  }

  public static void main(String[] args) {
    divisibleSumPairs(1, 1, new int[]{1, 2});
  }
}
