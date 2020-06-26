package implementation.beautifuldayatthemovies;

public class Solution {

  static int beautifulDays(int i, int j, int k) {
    int beautifulDays = 0;
    for (int d = i; d <= j; d++) {
      if (Math.abs(d - reverseInteger(d)) % k == 0) {
        beautifulDays++;
      }
    }
    return beautifulDays;

  }

  private static int reverseInteger(Integer integer) {
    int reverse = 0;
    while (integer > 0) {
      reverse = (reverse * 10) + (integer % 10);
      integer /= 10;
    }

    return reverse;
  }


  public static void main(String[] args) {
    System.out.println(beautifulDays(20, 23, 6));
  }

}
