package implementation.halloweensale;

import java.util.Scanner;

public class Solution {

  static int howManyGames(int price, int d, int m, int initialAmount) {
    int purchasesCount = 0;
    while (initialAmount >= price) {
      initialAmount -= price;
      if (price - d >= m) {
        price -= d;
      } else {
        price = m;
      }
      purchasesCount++;
    }
    return purchasesCount;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int p = in.nextInt();
    int d = in.nextInt();
    int m = in.nextInt();
    int s = in.nextInt();
    int answer = howManyGames(p, d, m, s);
    System.out.println(answer);
    in.close();
  }

}
