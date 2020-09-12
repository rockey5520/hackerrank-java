package implementation.modifiedkarpekarnumbers;

import static java.lang.Long.parseLong;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long p = parseLong(sc.nextLine());
    long q = parseLong(sc.nextLine());
    boolean found = false;
    for (long i = p; i <= q; i++) {
      if (isKaprekar(i)) {
        found = true;
        System.out.print(i + " ");
      }
    }
    if (!found) {
      System.out.println("INVALID RANGE");
    }
  }

  public static boolean isKaprekar(long num) {
    int d = Long.toString(num).length();
    String square = Long.toString(num * num);
    int leftLength = square.length() - d;
    String firstSubstring = "0";
    if (leftLength > 0) {
      firstSubstring = square.substring(0, leftLength);
    }
    String secondSubstring = square.substring(leftLength);
    return num == parseLong(firstSubstring) + parseLong(secondSubstring);
  }
}
