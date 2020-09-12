package implementation.acmicpcteam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

  private static final Scanner scanner = new Scanner(System.in);

  // Complete the acmTeam function below.
  static int[] acmTeam(String[] topic) {
    return maxTopics(topic);
  }

  public static int numTopics(char[] topics) {
    int count = 0;
    for (char topic : topics) {
      if (topic == '1') {
        count++;
      }
    }
    return count;
  }

  public static char[] mergeTeams(String t1, String t2) {
    char[] combined = new char[t1.length()];
    for (int i = 0; i < t1.length(); i++) {
      if (t1.charAt(i) == '1' || t2.charAt(i) == '1') {
        combined[i] = '1';
      } else {
        combined[i] = '0';
      }
    }
    return combined;
  }

  public static int[] maxTopics(String[] A) {
    int max = -1;
    for (int i = 0; i < A.length; i++) {
      for (int j = i + 1; j < A.length; j++) {
        if (numTopics(mergeTeams(A[i], A[j])) > max) {
          max = (numTopics(mergeTeams(A[i], A[j])));
        }
      }
    }
    int count = 0;
    for (int i = 0; i < A.length; i++) {
      for (int j = A.length - 1; j >= i + 1; j--) {
        if (numTopics(mergeTeams(A[i], A[j])) == max) {
          count++;
        }
      }
    }
    return new int[]{max, count};
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(
        new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] nm = scanner.nextLine().split(" ");

    int n = Integer.parseInt(nm[0]);

    int m = Integer.parseInt(nm[1]);

    String[] topic = new String[n];

    for (int i = 0; i < n; i++) {
      String topicItem = scanner.nextLine();
      topic[i] = topicItem;
    }

    int[] result = acmTeam(topic);

    for (int i = 0; i < result.length; i++) {
      bufferedWriter.write(String.valueOf(result[i]));

      if (i != result.length - 1) {
        bufferedWriter.write("\n");
      }
    }

    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }

}
