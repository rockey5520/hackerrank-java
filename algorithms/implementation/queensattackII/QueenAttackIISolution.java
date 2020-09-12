package implementation.queensattackII;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;


public class QueenAttackIISolution {

  private static final int[] Direction_R = {-1, -1, -1, 0, 1, 1, 1, 0};
  private static final int[] Direction_C = {-1, 0, 1, 1, 1, 0, -1, -1};
  private static final Scanner scanner = new Scanner(System.in);

  private static long getPosition(int r, int c) {
    long key = r;
    key *= 1e6;
    key += c;
    return key;
  }

  // Complete the queensAttack function below.
  static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
    Set<Long> obstacles1 = new HashSet<>();
    IntStream.range(0, k).forEachOrdered(i -> {
      int rObstacle = obstacles[i][0];
      int cObstacle = obstacles[i][1];
      obstacles1.add(getPosition(rObstacle, cObstacle));
    });
    int count = 0;
    int dir = 0;
    while (dir < 8) {
      int row = r_q + Direction_R[dir];
      int col = c_q + Direction_C[dir];
      while (row > 0 && row <= n && col > 0 && col <= n && !obstacles1
          .contains(getPosition(row, col))) {
        count++;
        row += Direction_R[dir];
        col += Direction_C[dir];
      }
      dir++;
    }
    return count;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(
        new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] nk = scanner.nextLine().split(" ");

    int n = Integer.parseInt(nk[0]);

    int k = Integer.parseInt(nk[1]);

    String[] r_qC_q = scanner.nextLine().split(" ");

    int r_q = Integer.parseInt(r_qC_q[0]);

    int c_q = Integer.parseInt(r_qC_q[1]);

    int[][] obstacles = new int[k][2];

    for (int i = 0; i < k; i++) {
      String[] obstaclesRowItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int j = 0; j < 2; j++) {
        int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
        obstacles[i][j] = obstaclesItem;
      }
    }

    int result = queensAttack(n, k, r_q, c_q, obstacles);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
