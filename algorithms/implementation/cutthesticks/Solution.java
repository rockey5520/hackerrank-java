package implementation.cutthesticks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  static int[] cutTheSticks(int[] arr) {
    List<Integer> sticksToCut = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
    List<Integer> result = new ArrayList<>();

    while (sticksToCut.size() != 0) {
      result.add(sticksToCut.size());
      int smallestStick = sticksToCut.get(0);
      sticksToCut = sticksToCut.stream().map(x -> x - smallestStick).filter(x -> x != 0)
          .collect(Collectors.toList());
    }

    return result.stream().mapToInt(Integer::intValue).toArray();

  }

  public static void main(String[] args) {
    cutTheSticks(new int[]{5, 4, 4, 2, 2, 8});
  }

}
