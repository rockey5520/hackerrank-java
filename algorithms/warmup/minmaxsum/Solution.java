package warmup.minmaxsum;

public class Solution {

  static void miniMaxSum(int[] arr) {
    long sum = 0;
    long min = Long.MAX_VALUE;
    long max = 0;
    for (int j = 0; j < 5; j++) {
      if (max < arr[j]) {
        max = arr[j];
      }
      if (min > arr[j]) {
        min = arr[j];
      }
      sum += arr[j];
    }
    System.out.println((sum - max) + " " + (sum - min));
  }

  public static void main(String[] args) {
    miniMaxSum(new int[]{1, 2, 3, 4, 5});
  }

}
