package warmup.birthdaycakecandles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

  static void birthdayCakeCandles(int[] ar) {
    Arrays.sort(ar);
    int highest = ar[ar.length - 1];
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer integer : ar
    ) {
      if (map.containsKey(integer)) {
        map.put(integer, map.get(integer) + 1);
      } else {
        map.put(integer, 1);
      }
    }
    int highestCount = map.get(highest);
    System.out.println(highestCount);
  }

  public static void main(String[] args) {
    birthdayCakeCandles(new int[]{3, 2, 1, 3});
  }

}
