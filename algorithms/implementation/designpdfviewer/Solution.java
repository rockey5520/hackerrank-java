package implementation.designpdfviewer;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

  static int designerPdfViewer(int[] h, String word) {
    Map<Character, Integer> map = new HashMap<>();
    Map<Character, Integer> map1 = new HashMap<>();
    List<Character> collect = IntStream.rangeClosed('A', 'Z').mapToObj(x -> (char) x)
        .collect(Collectors.toList());
    for (int i = 0; i < h.length; i++) {
      map.put(collect.get(i), h[i]);
    }

    map.entrySet().forEach(System.out::println);
    for (Character character : word.toUpperCase().toCharArray()
    ) {
      map1.put(character, map.get(character));
    }

    Integer jump = map1.values().stream().sorted(Collections.reverseOrder())
        .collect(Collectors.toList()).get(0);

    return jump * word.length();
  }


  public static void main(String[] args) {
    designerPdfViewer(
        new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
        "abc");
  }

}
