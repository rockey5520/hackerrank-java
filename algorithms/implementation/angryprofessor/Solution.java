package implementation.angryprofessor;

public class Solution {

  static String angryProfessor(int k, int[] a) {
    int lateStudents = 0;
    for (int value : a) {
      if (value <= 0) {
        lateStudents++;
      }
    }

    if (lateStudents >= k) {
      return "NO";
    } else {
      return "YES";
    }
  }

  public static void main(String[] args) {
    System.out.println(angryProfessor(2, new int[]{0, -1, 2, 1}));
  }

}
