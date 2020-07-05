package implementation.queensattackII;

public class Solution {

  static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
    int count = 0;

    if (!(n > 0 && n <= (int) Math.pow(10, 5))) {
      return count;
    }

    if (!((0 <= k && k <= (int) Math.pow(10, 5)))) {
      return count;
    }

    r_q = (n - 1) - (r_q - 1);
    c_q = c_q - 1;

    count += leftCount(obstacles, n, r_q, c_q);
    count += rightCount(obstacles, n, r_q, c_q);
    count += upCount(obstacles, n, r_q, c_q);
    count += downCount(obstacles, n, r_q, c_q);

    count += leftUpCount(obstacles, n, r_q, c_q);
    count += leftDownCount(obstacles, n, r_q, c_q);
    count += rightUpCount(obstacles, n, r_q, c_q);
    count += rightDownCount(obstacles, n, r_q, c_q);

    return count;
  }

  private static int rightDownCount(int[][] obstacles, int n, int r_q, int c_q) {
    int count = 0;
    while (c_q + 1 < n && r_q + 1 < n && !isObstacles(obstacles, n, r_q + 1, c_q + 1)) {
      count++;
      c_q++;
      r_q++;
    }

    return count;
  }

  private static int leftDownCount(int[][] obstacles, int n, int r_q, int c_q) {
    int count = 0;
    while (c_q - 1 >= 0 && r_q + 1 < n && !isObstacles(obstacles, n, r_q + 1, c_q - 1)) {
      count++;
      c_q--;
      r_q++;
    }
    return count;
  }

  private static int rightCount(int[][] obstacles, int n, int r_q, int c_q) {
    int count = 0;
    while (c_q + 1 < n && !isObstacles(obstacles, n, r_q, c_q + 1)) {
      count++;
      c_q++;
    }
    return count;
  }

  private static int rightUpCount(int[][] obstacles, int n, int r_q, int c_q) {
    int count = 0;
    while (c_q + 1 < n && r_q - 1 >= 0 && !isObstacles(obstacles, n, r_q - 1, c_q + 1)) {
      count++;
      c_q++;
      r_q--;
    }
    return count;
  }

  private static int downCount(int[][] obstacles, int n, int r_q, int c_q) {
    int count = 0;
    while (r_q + 1 < n && !isObstacles(obstacles, n, r_q + 1, c_q)) {
      count++;
      r_q++;
    }
    return count;
  }

  private static int upCount(int[][] obstacles, int n, int r_q, int c_q) {
    int count = 0;
    while (r_q - 1 >= 0 && !isObstacles(obstacles, n, r_q - 1, c_q)) {
      count++;
      r_q--;
    }
    return count;
  }

  private static int leftCount(int[][] obstacles, int n, int r_q, int c_q) {
    int count = 0;
    while (c_q - 1 >= 0 && !isObstacles(obstacles, n, r_q, c_q - 1)) {
      count++;
      c_q--;
    }
    return count;
  }

  private static int leftUpCount(int[][] obstacles, int n, int r_q, int c_q) {

    int count = 0;
    while (c_q - 1 >= 0 && r_q - 1 >= 0 && !isObstacles(obstacles, n, r_q - 1, c_q - 1)) {
      count++;
      c_q--;
      r_q--;
    }
    return count;

  }


  private static boolean isObstacles(int[][] obstacles, int n, int r_q, int c_q) {

    for (int[] obstacle : obstacles) {
      int row_x_i = obstacle[0];
      int col_y_j = obstacle[1];
      row_x_i = (n - 1) - (row_x_i - 1);
      col_y_j = col_y_j - 1;

      if (row_x_i == r_q && col_y_j == c_q) {
        return true;
      }
    }
    return false;

  }


  public static void main(String[] args) {
    System.out.println(queensAttack(4, 1, 1, 4, new int[][]{{}}));
  }

}
