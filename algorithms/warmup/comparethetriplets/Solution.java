package warmup.comparethetriplets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  static void compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> integers = new ArrayList<>();
    int aliceScore = 0;
    int bobScore = 0;
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        aliceScore++;
      } else if(a.get(i) < b.get(i)){
        bobScore++;
      }
    }
    integers.add(aliceScore);
    integers.add(bobScore);
    System.out.println(Arrays.toString(new List[]{integers}));

  }

  public static void main(String[] args) {
    //compareTriplets(List.of(17, 28, 30), List.of(99, 16, 8));
  }

}
