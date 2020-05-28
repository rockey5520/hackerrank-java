package arrays.arraymanipulation;

import java.io.*;
import java.util.*;

public class Solution {

  // Complete the arrayManipulation function below.
  static long arrayManipulation(int n, int[][] queries) {
    long output[] = new long[n + 2];
    for (int i = 0; i < queries.length; i++) {
      int a = queries[i][0];
      int b = queries[i][1];
      int k = queries[i][2];
      output[a] += k;
      output[b+1] -= k;
    }
    long max = getMaxiumNumber(output);
    return max;
  }
  private static long getMaxiumNumber(long[] array) {
    long max = Long.MIN_VALUE;
    long sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
      max = Math.max(max, sum);
    }
    return max;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    int n = 5;
    int[][] arr = new int[][]{{1, 2, 100},
        {2, 5, 100},
        {3, 4, 100}};
    arrayManipulation(n, arr);
  }
}
