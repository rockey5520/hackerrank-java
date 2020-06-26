package implementation.extralongfactorials;


import java.math.BigInteger;

public class Solution {

  static void extraLongFactorials(int n) {
    BigInteger answer = BigInteger.valueOf(1);
    for (int i = 1; i <= n; i++) {
      answer = answer.multiply(BigInteger.valueOf(i));
    }
    System.out.println(answer);

  }

  public static void main(String[] args) {
    extraLongFactorials(25);
  }
}
