package implementation.thetimeinwords;

import java.util.Scanner;

public class Solution {

  static final String[] hours = {"one", "two", "three", "four", "five", "six", "seven", "eight",
      "nine", "ten", "eleven", "twelve", "one"};

  static final String[] numNames = {
      "one",
      "two",
      "three",
      "four",
      "five",
      "six",
      "seven",
      "eight",
      "nine",
      "ten",
      "eleven",
      "twelve",
      "thirteen",
      "fourteen",
      "fifteen",
      "sixteen",
      "seventeen",
      "eighteen",
      "nineteen"
  };

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Hours = Integer.parseInt(sc.nextLine());
    int Minutes = Integer.parseInt(sc.nextLine());

    if (Minutes == 0) {
      System.out.println(hours[Hours - 1] + " o' clock");
    } else if (Minutes == 15) {
      System.out.println("quarter past " + hours[Hours - 1]);
    } else if (Minutes < 30) {
      if (Minutes == 1) {
        System.out.println(numToWord(Minutes) + " minute past " + hours[Hours - 1]);
      } else {
        System.out.println(numToWord(Minutes) + " minutes past " + hours[Hours - 1]);
      }
    } else if (Minutes == 30) {
      System.out.println("half past " + hours[Hours - 1]);
    } else if (Minutes == 45) {
      System.out.println("quarter to " + hours[Hours]);
    } else {
      Minutes = 60 - Minutes;
      if (Minutes == 1) {
        System.out.println(numToWord(Minutes) + " minute to " + hours[Hours]);
      } else {
        System.out.println(numToWord(Minutes) + " minutes to " + hours[Hours]);
      }
    }
  }

  public static String numToWord(int M) {
    if (M < 20) {
      return numNames[M - 1];
    } else {
      int digit = M % 10;
      return "twenty " + numNames[digit - 1];
    }
  }
}
