package implementation.appendanddelete;

public class Solution {

  static String appendAndDelete(String s, String t, int k) {
    if (s.equals(t)) {
      return (k >= s.length() * 2 || k % 2 == 0) ? "Yes" : "No";
    }

    int lengthOfCommonSubstring = 0;

    for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
      if (t.charAt(i) != s.charAt(i)) {
        break;
      }
      lengthOfCommonSubstring++;
    }

    int unrelatedStringLengthOfS = s.length() - lengthOfCommonSubstring;
    int unrelatedStringLengthOfT = t.length() - lengthOfCommonSubstring;
    int totalLengthOfUnrelatedString = unrelatedStringLengthOfS + unrelatedStringLengthOfT;

    return ((totalLengthOfUnrelatedString == k) || (totalLengthOfUnrelatedString < k
        && (totalLengthOfUnrelatedString - k) % 2 == 0) || (
        totalLengthOfUnrelatedString + (2 * lengthOfCommonSubstring) <= k))
        ? "Yes" : "No";


  }

  public static void main(String[] args) {
    appendAndDelete("ashley", "ash", 2);
  }

}
