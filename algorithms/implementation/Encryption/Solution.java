package implementation.Encryption;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Solution {

  private static String encode(String message) {
    int length = message.length();
    if (length == 0) {
      return message;
    }
    StringBuilder encoded = new StringBuilder();
    int sqrt = (int) Math.ceil(Math.sqrt(length));
    for (int col = 0; col < sqrt; col++) {
      for (int row = 0; row < sqrt; row++) {
        int position = row * sqrt + col;
        if (position < length) {
          encoded.append(message.charAt(position));
        }
      }
      encoded.append(' ');
    }
    return encoded.substring(0, encoded.length() - 1);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        System.in, StandardCharsets.UTF_8));
    System.out.println(encode(reader.readLine()));
  }
}
