package warmup.diagonaldifference;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static void diagonalDifference(List<List<Integer>> arr) {
    int leftDiagnoalSum = 0;
    int rightDiagnoalSum = 0;

    for (int i = 0; i < arr.size(); i++) {
      for (int j = 0; j < arr.size(); j++) {
        if (i == j) {
          leftDiagnoalSum += arr.get(i).get(j);
        }
      }
    }
    for (int i = 0; i < arr.size(); i++) {
      for (int j = arr.size() - 1; j >= 0; j--) {
        if ((i + j) == (arr.size() - 1)) {
          rightDiagnoalSum += arr.get(i).get(j);
        }
      }
    }
    System.out.println(Math.abs(leftDiagnoalSum - rightDiagnoalSum));
  }

  public static void main(String[] args) {

    List<List<Integer>> arr = new ArrayList<>();
    List<Integer> arr1 = new ArrayList<>();
    arr1.add(11);
    arr1.add(2);
    arr1.add(4);
    arr.add(arr1);
    List<Integer> arr2 = new ArrayList<>();
    arr2.add(4);
    arr2.add(5);
    arr2.add(6);
    arr.add(arr2);
    List<Integer> arr3 = new ArrayList<>();
    arr3.add(10);
    arr3.add(8);
    arr3.add(-12);
    arr.add(arr3);

    diagonalDifference(arr);
  }

}
