package sorting.bigsorting;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

  static String[] bigSorting(String[] unsorted) {
    List<BigInteger> longs = new ArrayList<>();
    for (String s : unsorted
    ) {
      longs.add(new BigInteger(s));
    }
    Collections.sort(longs);
    String[] strings = new String[unsorted.length];
    for (int i = 0; i < longs.size(); i++) {
      strings[i] = String.valueOf(longs.get(i));
      System.out.println(strings[i]);
    }
    return strings;
  }

  public static void main(String[] args) {
    bigSorting(new String[]{"1", "2"
        , "100"
        , "12303479849857341718340192371"
        , "3084193741082937"
        , "3084193741082938"
        , "111"
        , "200"});
  }
}
