package implementation.equalizethearray;

import java.util.Arrays;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

  static int equalizeArray(int[] arr) {
    Map<Integer, Long> freq = Arrays.stream(arr).boxed().
        collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    OptionalInt max = freq.values().stream().mapToInt(Long::intValue).max();
    return arr.length - max.getAsInt();
  }

  public static void main(String[] args) {
    System.out.println(equalizeArray(new int[]{1, 2, 2, 3}));
  }

}
