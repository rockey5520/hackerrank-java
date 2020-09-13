package implementation.minimumdistances;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Solution {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    StringTokenizer st = new StringTokenizer(in.readLine());
    int[] inputArray = IntStream.range(0, n).map(i -> Integer.parseInt(st.nextToken())).toArray();

    int output = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (inputArray[i] == inputArray[j] && j - i < output) {
          output = j - i;
        }
      }
    }
    System.out.println(output == Integer.MAX_VALUE ? -1 : output);
  }
}
