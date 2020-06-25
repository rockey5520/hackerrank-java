package implementation.climbingtheleaderboard;

public class Solution {

  static int binarySearch(int[] scores, int key) {
    int h = 0, l = scores.length - 1;
    if (key > scores[h]) {
      return -1;
    }
    if (key < scores[l]) {
      return l + 1;
    }
    while (l >= h) {
      int mid = (l + h) / 2;
      if (scores[mid] == key) {
        return mid;
      } else if (scores[mid] < key) {
        l = mid - 1;
      } else {
        h = mid + 1;
      }
    }
    return l;
  }

  static int[] climbingLeaderboard(int[] scores, int[] alice) {
    int[] leaderBoard = new int[scores.length];
    int r = 1;
    leaderBoard[0] = r;
    for (int i = 1; i < scores.length; i++) {
      if (scores[i - 1] == scores[i]) {
        leaderBoard[i] = r;
      } else {
        r++;
        leaderBoard[i] = r;
      }
    }
    int[] aliceRank = new int[alice.length];
    for (int i = 0; i < alice.length; i++) {
      int ind = binarySearch(scores, alice[i]);
      if (ind == -1) {
        aliceRank[i] = 1;
      } else if (ind == scores.length) {
        aliceRank[i] = leaderBoard[ind - 1] + 1;
      } else if (scores[ind] == alice[i]) {
        aliceRank[i] = leaderBoard[ind];
      } else if (scores[ind] < alice[i]) {
        aliceRank[i] = leaderBoard[ind] - 1;
      } else if (scores[ind] > alice[i]) {
        aliceRank[i] = leaderBoard[ind] + 1;
      }
    }
    return aliceRank;
  }

  public static void main(String[] args) {
    climbingLeaderboard(new int[]{100, 100, 50, 40, 40, 20, 10}, new int[]{5, 25, 50, 120});
  }
}
