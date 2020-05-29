package dictionariesandhashmaps.frequencyqueries;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  static List<Integer> freqQuery(List<List<Integer>> queries) {
    List<Integer> integers = new ArrayList<>();

    for (int i = 0; i < queries.size(); i++) {
      System.out.println(queries.get(i).toString());
    }

    return null;
  }

  public static void main(String[] args) {
    List<List<Integer>> queries = new ArrayList<>();
    List<Integer> query = new ArrayList<>();
    query.add(5);
    queries.add(1, query);
    query.add(6);
    queries.add(1, query);
    query.add(2);
    queries.add(3, query);
    query.add(10);
    queries.add(1, query);
    query.add(10);
    queries.add(1, query);
    query.add(6);
    queries.add(1, query);
    query.add(5);
    queries.add(2, query);
    query.add(2);
    queries.add(3, query);

    List<Integer> integers = freqQuery(queries);
    System.out.println(integers.toString());
  }

}
