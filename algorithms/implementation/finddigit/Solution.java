package implementation.finddigit;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  static int findDigits(int n) {
    int value = n;
    List<Integer> integers = new ArrayList<>();
    while (n > 0) {
      int a = n % 10;
      if (a != 0 && value % a == 0) {
        integers.add(a);
      }
      n /= 10;
    }
    return integers.size();
  }

  public static void main(String[] args) {
    System.out.println(findDigits(1012));
  }

}
