package implementation.bonappétit;

import java.util.List;

public class Solution {

  static void bonAppetit(List<Integer> bill, int k, int b) {
    double sum = bill.stream().mapToInt(Integer::intValue).sum();
    double actuallBill = (sum - bill.get(k)) / 2;
    if (actuallBill == (double) b) {
      System.out.println("Bon Appetit");
    } else {
      System.out.println(b - (int) actuallBill);
    }
  }

  public static void main(String[] args) {

  }

}
