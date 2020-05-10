package arrays.leftrotation;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
import java.util.stream.Stream;

public class Solution_v1 {

  // Complete the rotLeft function below.
  static int[] rotLeft(int[] a, int d) {
    System.out.println(d%a.length);
    int[] leftints = Arrays.copyOfRange(a, (a.length - (a.length - (d % a.length))), a.length);
    int[] rightints = Arrays.copyOfRange(a, 0, d%a.length);
    int[] finalarray = Arrays.copyOf(leftints, leftints.length + rightints.length);
    System.arraycopy(rightints, 0, finalarray, leftints.length, rightints.length);
    return finalarray;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    int[] input = new int[]{1,2,3,4,5};
    int  shift = 56;
    int[] ints = rotLeft(input, shift);
    for (Integer integer: ints
    ) {
      System.out.print(integer+" ");
    }
  }
}