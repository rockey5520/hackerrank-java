package implementation.organizingcontainersofballs;

import static java.util.Arrays.sort;

import java.util.Scanner;

public class OrgSolution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    int i = 0;
    while (i < q) {
      int n = in.nextInt();
      int[][] matrix = new int[n][n];
      for (int matrix_i = 0; matrix_i < n; matrix_i++) {
        for (int matrix_j = 0; matrix_j < n; matrix_j++) {
          matrix[matrix_i][matrix_j] = in.nextInt();
        }
      }
      int[] rowTotal = new int[n];
      int[] columnTotal = new int[n];
      for (int row_i = 0; row_i < n; row_i++) {
        for (int row_j = 0; row_j < n; row_j++) {
          rowTotal[row_i] += matrix[row_i][row_j];
          columnTotal[row_j] += matrix[row_i][row_j];
        }
      }
      sort(rowTotal);
      sort(columnTotal);
      String ans = "Possible";
      for (int i2 = 0; i2 < n; i2++) {
        if (rowTotal[i2] != columnTotal[i2]) {
          ans = "Impossible";
        }
      }
      System.out.println(ans);
      i++;
    }
  }
}
