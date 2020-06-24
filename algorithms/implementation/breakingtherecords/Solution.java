package implementation.breakingtherecords;

public class Solution {

  static int[] breakingRecords(int[] scores) {

    int maxiumimScore, minimumScore;
    int[] minMaxCount = new int[2];
    maxiumimScore = minimumScore = scores[0];

    for (int i = 1; i < scores.length; i++) {
      if (scores[i] > maxiumimScore) {
        maxiumimScore = scores[i];
        minMaxCount[0]++;
      }
      if (scores[i] < minimumScore) {
        minimumScore = scores[i];
        minMaxCount[1]++;
      }
    }
    return minMaxCount;


  }


  public static void main(String[] args) {

    int[] ints = breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42});
    for (Integer integer : ints
    ) {
      System.out.println(integer);
    }
  }

}
