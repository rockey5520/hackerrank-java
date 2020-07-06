package implementation.queensattackII;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    String input = "RakeshMothukuri";
    countMoreThanTwoCharacters(input.toCharArray());
  }

  private static void countMoreThanTwoCharacters(char[] input) {
    Map<Character, Integer> frequencies = new HashMap<>();
    for (char ch : input) {
      frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
    }

    frequencies.entrySet().stream().filter(x -> x.getValue() >= 2)
        .map(Entry::getKey).collect(Collectors.toList()).forEach(System.out::println);
  }

}
