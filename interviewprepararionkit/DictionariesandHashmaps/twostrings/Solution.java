package DictionariesandHashmaps.twostrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

  // Complete the twoStrings function below.
  static String twoStrings(String s1, String s2) {

    Set<Character> set1 = new HashSet<>();
    Set<Character> set2 = new HashSet<>();

    for (Character character : s1.toCharArray()
    ) {
      set1.add(character);
    }
    for (Character character : s2.toCharArray()
    ) {
      set2.add(character);
    }
    System.out.println(set1.toString());
    set1.retainAll(set2);
    System.out.println(set1.toString());
    System.out.println(set2.toString());

    return set1.isEmpty() ? "NO" : "YES";

  }


  public static void main(String[] args) {
    String s = twoStrings("hello", "world");
    System.out.println(s);
  }
}
