package implementation.jumpingoncloudsrevisited;

public class Solution {

  static int jumpingOnClouds(int[] c, int k) {
    int lengthofTheCLoudsArray = c.length;
    int energy = 100;
    int i = 0;

    do {
      energy = c[(i + k) % lengthofTheCLoudsArray] == 1 ? energy - 1 - 2 : energy - 1;
      i += k;
    } while (i % lengthofTheCLoudsArray != 0);

    return energy;
  }


  public static void main(String[] args) {
    jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1}, 2);
  }

}
