package implementation.catandmouse;

public class Solution {

  static String catAndMouse(int x, int y, int z) {
    int distanceFromA = Math.abs(z - x);
    int distanceFromB = Math.abs(z - y);
    if (distanceFromA < distanceFromB) {
      return "Cat A";
    } else if (distanceFromA > distanceFromB) {
      return "Cat B";
    } else {
      return "Mouse C";
    }
  }

  public static void main(String[] args) {

    catAndMouse(1, 1, 1);
  }

}
