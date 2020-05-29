package dictionariesandhashmaps.frequencyqueries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

  static List<Integer> freqQuery(List<List<Integer>> queries) {
      List<Integer> output = new ArrayList<>();
      Map<Integer, Integer> numbers = new HashMap<>();
      Map<Integer, Integer> frquency = new HashMap<>();
      for(List<Integer> query : queries) {
        int key = query.get(0);
        int value = query.get(1);
        int count;
        switch(key) {
          case 1:
            count = numbers.getOrDefault(value, 0);
            numbers.put(value, count + 1);
            frquency.put(count + 1, frquency.getOrDefault(count + 1 , 0) + 1);
            frquency.put(count , Math.max(frquency.getOrDefault(count , 0) - 1, 0));
            break;
          case 2:
            count = numbers.getOrDefault(value, 0);
            numbers.put(value, Math.max(count - 1, 0));
            frquency.put(count - 1, frquency.getOrDefault(count -1, 0) + 1);
            frquency.put(count , Math.max(frquency.getOrDefault(count , 0) - 1, 0));
            break;
          case 3:
            output.add(frquency.getOrDefault(value, 0) != 0 ? 1 : 0);
            break;
        }
      }

      return output;
    /*Map<Integer, Integer> integers = new HashMap<>();
    List<Integer> answers = new ArrayList<>();

    int count = 0;
    for (List<Integer> list : queries
    ) {
      int operation = list.get(0);
      if (operation == 3) {
        count++;
      }
    }
    System.out.println(count);
    int count1 = 0;
    for (List<Integer> list : queries
    ) {
      int operation = list.get(0);
      int value = list.get(1);
      switch (operation) {
        case 1:
          if (count1 == count) {
            break;
          }
          if (!integers.containsKey(value)) {
            integers.put(value, 1);
          } else {
            integers.put(value, integers.get(value) + 1);
          }
          break;
        case 2:
          if (count1 == count) {
            break;
          }
          if (integers.containsKey(value)) {
            int frequency = integers.get(value);
            if (frequency > 1) {
              integers.put(value, frequency - 1);
            } else {
              integers.remove(value);
            }
          }
          break;
        case 3:
          count1++;
          answers.add(integers.entrySet().stream().anyMatch(x -> x.getValue() == value) ? 1 : 0);
          break;
      }
    }
    return answers;*/
  }


  public static void main(String[] args) {
    List<List<Integer>> queries = new ArrayList<>();
    List<Integer> query1 = new ArrayList<>();
    query1.add(1);
    query1.add(5);
    queries.add(query1);
    List<Integer> query2 = new ArrayList<>();
    query2.add(1);
    query2.add(6);
    queries.add(query2);
    List<Integer> query3 = new ArrayList<>();
    query3.add(3);
    query3.add(2);
    queries.add(query3);
    List<Integer> query4 = new ArrayList<>();
    query4.add(1);
    query4.add(10);
    queries.add(query4);
    List<Integer> query5 = new ArrayList<>();
    query5.add(1);
    query5.add(10);
    queries.add(query5);
    List<Integer> query6 = new ArrayList<>();
    query6.add(1);
    query6.add(6);
    queries.add(query6);
    List<Integer> query7 = new ArrayList<>();
    query7.add(2);
    query7.add(5);
    queries.add(query7);
    List<Integer> query8 = new ArrayList<>();
    query8.add(3);
    query8.add(2);
    queries.add(query8);

    List<Integer> integers = freqQuery(queries);
    System.out.println(integers.toString());
  }

}
