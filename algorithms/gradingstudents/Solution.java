package gradingstudents;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  public static void main(String[] args) {
    List<Integer> result = Result.gradingStudents(List.of(73, 67, 38, 33));
    System.out.println(Arrays.toString(new List[]{result}));

  }
}

class Result {


  public static List<Integer> gradingStudents(List<Integer> grades) {
    return grades.stream().map(grade -> grade >= 38 && grade % 5 >= 3 ? (grade / 5) * 5 + 5 : grade)
        .collect(
            Collectors.toList());


  }

}