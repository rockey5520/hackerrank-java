package implementation.savetheprisoner;

public class Solution {

  static int saveThePrisoner(int n, int m, int s) {
    int lt, seat, lMinusN;
    int rem = m % n;

    if (s == 1) {
      if (rem == 0) {
        seat = n;
      } else {
        seat = rem;
      }

    } else {
      lt = s - 1;

      if (rem == 0) {

        seat = lt;
      } else {
        int temp = lt + rem;
        if (temp <= n) {
          seat = temp;
        } else {

          lMinusN = Math.abs(lt - n);
          seat = rem - lMinusN;

        }
      }

    }

    return seat;

  }


  public static void main(String[] args) {
    System.out.println(saveThePrisoner(5, 2, 1));
  }

}
