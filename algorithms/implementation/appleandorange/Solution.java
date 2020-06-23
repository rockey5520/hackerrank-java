package implementation.appleandorange;

public class Solution {

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    int[] result = new int[2];

    for (int apple : apples) {
      if (s <= apple + a && t >= apple + a) {
        result[0] += 1;
      }

    }

    for (int orange : oranges) {
      if (s <= orange + b && t >= orange + b) {
        result[1] += 1;
      }
    }

    System.out.print(result[0] + " " + result[1] + "\n");

  }

  public static void main(String[] args) {
    countApplesAndOranges();
  }

}
