package warmup.simplearraysum;

import java.util.Arrays;

public class Solution {

  /*
   * Complete the simpleArraySum function below.
   */
  static void simpleArraySum(int[] ar) {
    System.out.println(Arrays.stream(ar).sum());

  }


  public static void main(String[] args) {
    simpleArraySum(new int[]{1, 2, 3, 4, 10, 11});
  }

}
