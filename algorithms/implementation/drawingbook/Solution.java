package implementation.drawingbook;

public class Solution {

  static int pageCount(int n, int p) {
    int totalPages = n / 2;
    int numberOfPagesToRight = p / 2;
    int numberOfPagesToLeft = totalPages - numberOfPagesToRight;
    return Math.min(numberOfPagesToRight, numberOfPagesToLeft);
  }

  public static void main(String[] args) {

    pageCount(1, 1);
  }

}
