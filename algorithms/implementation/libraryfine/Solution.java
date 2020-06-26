package implementation.libraryfine;

public class Solution {

  static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    if (y1 > y2) {
      return 10000;
    }
    if ((m1 > m2) && (y1 >= y2)) {
      return (m1 - m2) * 500;
    }
    if ((d1 > d2) && (m1 >= m2) && (y1 >= y2)) {
      return (d1 - d2) * 15;
    }
    return 0;
  }


  public static void main(String[] args) {
    libraryFine(9, 6, 2015, 6, 6, 2015);
  }

}
