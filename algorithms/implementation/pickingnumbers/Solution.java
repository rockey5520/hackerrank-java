package implementation.pickingnumbers;

import java.util.List;

public class Solution {

  public static int pickingNumbers(List<Integer> a) {
    int[] frequency = new int[101];
    for (Integer i : a) {
      frequency[i]++;
    }
    int maxLength = 0;
    for (int i = 1; i < frequency.length - 1; i++) {
      if ((frequency[i] + frequency[i + 1]) > maxLength) {
        maxLength = frequency[i] + frequency[i + 1];
      }
    }
    return maxLength;
  }

  public static void main(String[] args) {
    //System.out.println(pickingNumbers(List.of(1, 1, 2, 2, 4, 4, 5, 5, 5)));
  }

}
