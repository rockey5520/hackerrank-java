package implementation.climbingtheleaderboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  static int[] climbingLeaderboard(int[] scores, int[] alice) {
    List<Integer> alicePositions = new ArrayList<>();
    for (Integer aliceScores : alice
    ) {
      List<Integer> includedAliceScores = new ArrayList<>();
      for (Integer leaderBoard : scores) {
        includedAliceScores.add(leaderBoard);
      }
      includedAliceScores.add(aliceScores);
      List<Integer> i = includedAliceScores.parallelStream().distinct()
          .sorted(Collections.reverseOrder())
          .collect(Collectors.toList());
      int i1 = Collections.binarySearch(i, aliceScores, Collections.reverseOrder());
      alicePositions.add(i1 + 1);
    }
    return alicePositions.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {
    climbingLeaderboard(new int[]{100, 100, 50, 40, 40, 20, 10}, new int[]{5, 25, 50, 120});
  }
}
