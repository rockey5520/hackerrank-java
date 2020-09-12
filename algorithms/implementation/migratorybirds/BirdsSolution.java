package implementation.migratorybirds;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BirdsSolution {

  static int migratoryBirds(List<Integer> arr) {
    int id = 0;
    int frequencyHighest = 0;

    Set<Integer> distinctValues = new HashSet<>(arr);

    for (Integer integer : distinctValues) {
      Integer freq = Collections.frequency(arr, integer);
      if (freq > frequencyHighest) {
        frequencyHighest = freq;
        id = integer;
      } else if (freq == frequencyHighest) {
        if (integer < id) {
          id = integer;
        }
      }
    }

    return id;
  }

  public static void main(String[] args) {
    //migratoryBirds(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4));
  }

}
