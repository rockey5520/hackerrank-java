package implementation.beautifultriplets;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int d = in.nextInt();
    int[] inputArray;
    int beautifulPairs = 0;
    inputArray = IntStream.range(0, n).map(c_i -> in.nextInt()).toArray();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i != j && inputArray[j] - inputArray[i] == d) {
          for (int k = 0; k < n; k++) {
            if (k != j && k != i && inputArray[k] - inputArray[j] == d) {
              beautifulPairs++;
            }
          }
        }
      }
    }
    System.out.println(beautifulPairs);
  }
}
