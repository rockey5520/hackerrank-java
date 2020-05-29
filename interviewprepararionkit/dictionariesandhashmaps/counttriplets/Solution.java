package dictionariesandhashmaps.counttriplets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

  static long countTriplets(List<Long> arr, long r) {
    Map<Long, Long> elements = new HashMap<>();
    Map<Long, Long> triplets = new HashMap<>();

    long count = 0;

    for (int i = arr.size() - 1; i >= 0; i--) {
      long element = arr.get(i);

      if (triplets.containsKey(element * r)) {
        count += triplets.get(element * r);
      }

      if (elements.containsKey(element * r)) {
        long value = elements.get(element * r);
        triplets.put(element, triplets.getOrDefault(element, 0L) + value);
      }

      elements.put(element, elements.getOrDefault(element, 0L) + 1);
    }
    return count;

  }

  public static void main(String[] args) {

  }

}
