package dictionariesandhashmaps.ransomnote;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

  // Complete the checkMagazine function below.
  static void checkMagazine(String[] magazine, String[] note) {
    if (note.length > magazine.length) {
      System.out.println("No");
      System.exit(0);
    }
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    magazineMap = count(magazine);
    noteMap = count(note);

    Set<String> strings = noteMap.keySet();
    for (String s : strings
    ) {
      if (magazineMap.containsKey(s)) {
        if (!(noteMap.get(s) <= magazineMap.get(s))) {
          System.out.println("No");
          System.exit(0);
        }
      }else{
        System.out.println("No");
        System.exit(0);
      }
    }
    System.out.println("Yes");
  }

  private static Map<String, Integer> count(String[] word) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : word
    ) {
      if (!map.containsKey(s)) {
        map.put(s, 1);
      } else {
        map.put(s, map.get(s) + 1);
      }
    }
    return map;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    String[] magazine = "ive got a lovely bunch of coconuts".split(" ");
    String[] note = "ive got some coconuts".split(" ");

    checkMagazine(magazine, note);
  }
}
