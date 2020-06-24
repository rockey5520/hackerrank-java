package implementation.betweentwosets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    List<Integer> result = new ArrayList<>();
    int lenghtofListA = a.size();
    int sum = 0;

    Collections.sort(a);
    Collections.sort(b);

    for (int i = a.get(lenghtofListA - 1); i <= b.get(0); i++) {
      int count = 0;
      for (Integer f : a) {
        if (i % f != 0) {
          break;
        }
        count++;
      }
      if (count == a.size()) {
        result.add(i);
      }
    }

    for (Integer r : result) {
      int count = 0;
      for (Integer f : b) {
        if (f % r != 0) {
          break;
        }
        count++;
      }
      if (count == b.size()) {
        sum++;
      }
    }
    return sum;

  }

  public static void main(String[] args) {

  }
}
