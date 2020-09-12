package implementation.birthdaychocolate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  static int birthday(List<Integer> s, int d, int m) {
    List<List<Integer>> lists = new ArrayList<>();
    for (int i = 0; i < s.size(); i++) {
      for (int j = i; j < s.size(); j++) {
        List<Integer> subArray = new ArrayList<>();
        for (int k = i; k <= j; k++) {
          subArray.add(s.get(k));
        }
        lists.add(subArray);
      }
    }
    List<List<Integer>> collect = lists.stream().filter(x -> x.size() == m)
        .filter(x -> x.stream().mapToInt(Integer::intValue).sum() == d)
        .collect(Collectors.toList());

    for (List<Integer> integers : collect
    ) {
      System.out.println(Arrays.toString(new List[]{integers}));
    }
    return collect.size();


  }

  public static void main(String[] args) {

    //birthday(List.of(1, 2, 1, 3, 2), 3, 2);
  }
}
