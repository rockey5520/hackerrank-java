package timconversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Solution {

  static void timeConversion(String s) {
    SimpleDateFormat simpleDateFormat_12 = new SimpleDateFormat("hh:mm:ssa");
    SimpleDateFormat simpleDateFormat_24 = new SimpleDateFormat("HH:mm:ss");
    try {
      System.out.println(simpleDateFormat_24.format(simpleDateFormat_12.parse(s)));
    } catch (ParseException e) {
      e.printStackTrace();
    }


  }

  public static void main(String[] args) {
    timeConversion("07:05:45PM");
  }

}
