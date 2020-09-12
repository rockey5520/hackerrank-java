package implementation.electronicsshop;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

  static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    /*
     * Write your code here.
     */
    Integer[] list = new Integer[keyboards.length * drives.length];
    Arrays.fill(list, 0);
    int idx = 0;
    for (int drive : drives) {
      for (int keyboard : keyboards) {
        if (b < drive + keyboard) {
          continue;
        }
        list[idx++] = drive + keyboard;
      }
    }
    Arrays.sort(list, Collections.reverseOrder());
    return list[0] == 0 ? -1 : list[0];
  }

  public static void main(String[] args) {

    int moneySpent = getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10);
    System.out.println(moneySpent);
  }
}
