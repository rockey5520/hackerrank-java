package implementation.Nondivisiblesubset;

import java.util.Arrays;
import java.util.List;

public class Solution {

  public static int nonDivisibleSubset(int k, List<Integer> s) {

    int[] objects = s.stream().mapToInt(Integer::intValue).toArray();

    int[] f = new int[k];
    Arrays.fill(f, 0);
    for (int i = 0; i < objects.length; i++) {
      f[objects[i] % k]++;
    }
    if (k % 2 == 0) {
      f[k / 2] = Math.min(f[k / 2], 1);
    }
    int res = Math.min(f[0], 1);

    for (int i = 1; i <= k / 2; i++) {
      res += Math.max(f[i], f[k - i]);
    }

    return res;


  }


  public static void main(String[] args) {
    //nonDivisibleSubset(4, List.of(19, 10, 12, 10, 24, 25, 22));
  }
}
