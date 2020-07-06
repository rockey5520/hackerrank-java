package arrays.arraysds;

import java.util.Arrays;

public class Solution {

  static int[] reverseArray(int[] a) {
    int[] output = new int[a.length];
    int index = 0;
    for (int i = a.length - 1; i >= 0; i--) {
      output[i] = a[index];
      index++;
    }
    return output;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(reverseArray(new int[]{2, 3, 4, 1})));
  }
}
