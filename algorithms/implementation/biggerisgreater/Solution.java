package implementation.biggerisgreater;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int testcases = parseInt(bufferedReader.readLine());
    if (testcases-- > 0) {
      do {
        char[] charArray = bufferedReader.readLine().toCharArray();
        int i, j;
        for (i = charArray.length - 1; i > 0; i--) {
          if (charArray[i] > charArray[i - 1]) {
            break;
          }
        }

        if (i < 1) {
          System.out.println("no answer");
          continue;
        }
        i--;

        for (j = charArray.length - 1; j > i; j--) {
          if (charArray[j] > charArray[i]) {
            break;
          }
        }
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        Arrays.sort(charArray, i + 1, charArray.length);
        System.out.println(charArray);
      } while (testcases-- > 0);
    }
  }
}
