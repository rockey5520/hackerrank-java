package implementation.thehurdlerace;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  static int hurdleRace(int k, int[] height) {

    List<Integer> collect = Arrays.stream(height).boxed().sorted(Collections.reverseOrder())
        .collect(Collectors.toList());
    Integer maxhurdle = collect.get(0);
    return Math.max(maxhurdle - k, 0);


  }

  public static void main(String[] args) {
    System.out.println(hurdleRace(6, new int[]{2, 5, 4, 5, 2}));
  }

}
