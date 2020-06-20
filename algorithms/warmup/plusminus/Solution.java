package warmup.plusminus;

public class Solution {

  static void plusMinus(int[] arr) {
    int positiveCount = 0, negetiveCount = 0, zeroCount = 0;
    for (int value : arr) {

      if (value < 0) {
        negetiveCount++;
      } else if (value > 0) {
        positiveCount++;
      } else {
        zeroCount++;
      }
    }
    float a, b, c;
    a = (float) positiveCount / arr.length;
    b = (float) negetiveCount / arr.length;
    c = (float) zeroCount / arr.length;
    System.out.printf("%.6f \n", a);
    System.out.printf("%.6f \n", b);
    System.out.printf("%.6f", c);
  }

  public static void main(String[] args) {
    plusMinus(new int[]{-4, 3, -9, 0, 4, 1});
  }

}
