package implementation.utopiantree;

public class Solution {

  static int utopianTree(int n) {

    int growth = 1;
    if (n == 0) {
      return growth;
    }
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        growth += 1;
      } else {
        growth *= 2;
      }
    }
    return growth;

  }

  public static void main(String[] args) {
    int i = utopianTree(4);
    System.out.println(i);
  }

}
