package MinimumSwaps2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  // Complete the minimumSwaps function below.
  /*
Looping through array
For each element:
Check if value of current element matching its expected position in the numerical sequence 1 to n
If not matching expected position:
Find the integer within the array that does match the position
Swap the matching integer and the current integer
and increment numberOfSwaps
   */
  static int minimumSwaps(int[] arr) {
    int numberOfSwaps = 0;
    for (int i = 0; i < arr.length ; i++) {
      int currentInt = arr[i];
      int currentIntPosition = i+1;
      if(currentInt != currentIntPosition){
        int indexToSwap = 0;
        for (int j = 0; j < arr.length ; j++) {
          if(arr[j] == currentIntPosition){
            indexToSwap = j;
            break;
          }
        }
        arr[indexToSwap] = currentInt;
        arr[i] = currentIntPosition;
        numberOfSwaps++;

      }
    }
   
    return numberOfSwaps;

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    int[] arr = new int[]{1,3,5,2,4,6,7};
    int res = minimumSwaps(arr);
    System.out.println(res);

  }
}
