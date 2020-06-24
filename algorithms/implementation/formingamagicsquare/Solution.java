package implementation.formingamagicsquare;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

  static int formingMagicSquare(int[][] s) {
    int[][][] magicSquares = {
        {
            {8, 3, 4},
            {1, 5, 9},
            {6, 7, 2}
        },
        {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        },
        {
            {4, 3, 8},
            {9, 5, 1},
            {2, 7, 6}
        },
        {
            {6, 1, 8},
            {7, 5, 3},
            {2, 9, 4}
        },
        {
            {2, 9, 4},
            {7, 5, 3},
            {6, 1, 8}
        },
        {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        },
        {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        },
        {
            {6, 7, 2},
            {1, 5, 9},
            {8, 3, 4}
        }


    };

    return Arrays
        .stream(magicSquares)
        .map(t -> Solution.distanceBetweenTwoArrays(s, t))
        .min(Comparator.naturalOrder())
        .get();

  }

  static int distanceBetweenTwoArrays(int[][] x, int[][] y) {
    int ret = 0;
    for (int i = 0; i < x.length; ++i) {
      for (int j = 0; j < x[i].length; ++j) {
        ret += Math.abs(x[i][j] - y[i][j]);
      }
    }
    return ret;
  }


  public static void main(String[] args) {
    int[][] a = {
        {1, 2, 3},
        {4, 5, 6, 9},
        {7},
    };

    formingMagicSquare(a);
  }
}
