package implementation.kangaroo;

public class Solution {

  static String kangaroo(int x1, int v1, int x2, int v2) {
    if (x1 == x2 && v1 == v2) {
      return "YES";
    } else if (x1 == x2 || v1 == v2) {
      return "NO";
    } else {
      for (int i = 0; i < x2 * v1; i++) {

        int x = i * v1 + x1;
        int y = i * v2 + x2;
        if (x == y) {
          return "YES";

        }
      }
    }
    return "NO";

  }

  public static void main(String[] args) {

  }
}
