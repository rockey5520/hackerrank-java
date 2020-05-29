package dictionariesandhashmaps.sherlockandanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {

  public static void main(String[] args) {
    int result = sherlockAndAnagrams(
        "abba");

    System.out.println(result);

  }

  static int sherlockAndAnagrams(String s) {

    Map<Integer, String> stringList = SubString(s, s.length());
    Map<String, String> anagramMap = new HashMap<>();
    String[] strings = stringList.values().toArray(new String[0]);
    int count = 0;
    for (int i = 0; i < strings.length; i++) {
      for (int j = i + 1; j < strings.length; j++) {
        if (isAnagram(strings[i], strings[j])) {
          count++;
        }
      }
    }

    return count;

  }

  private static Boolean isAnagram(String string1, String string2) {
    if (string1.length() != string2.length()) {
      return false;
    }
    char[] a1 = string1.toCharArray();
    char[] a2 = string2.toCharArray();
    int[] counts = new int[26];
    for (int i = 0; i < a1.length; i++) {
      counts[a1[i] - 97]++;
      counts[a2[i] - 97]--;
    }
    for (int i = 0; i < 26; i++) {
      if (counts[i] != 0) {
        return false;
      }
    }
    return true;
  }


  public static Map<Integer, String> SubString(String str, int n) {
    Map<Integer, String> stringIntegerMap = new HashMap<>();
    int counter = 1;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j <= n; j++)

      // Please refer below article for details
      // of substr in Java
      // https://www.geeksforgeeks.org/java-lang-string-substring-java/
      {
        stringIntegerMap.put(counter, str.substring(i, j));
        counter++;
      }
    }
    return stringIntegerMap;
  }


}
