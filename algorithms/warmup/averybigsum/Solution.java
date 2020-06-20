package warmup.averybigsum;

import java.math.BigInteger;
import java.util.Arrays;

public class Solution {

  static void aVeryBigSum(long[] ar) {

    int sum = 0;
    System.out.println(Arrays.stream(ar).sum());
    for (long s : ar
    ) {
      sum += s;
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    aVeryBigSum(new long[]{1000000001, 1000000002, 1000000003, 1000000004, 1000000005});
  }
}
