package implementation.sequenceequation;

public class Solution {

  static int[] permutationEquation(int[] p) {
    final int[] indexes = new int[p.length];
    for (int i = 0; i < indexes.length; i++) {
      indexes[p[i] - 1] = i;
    }
    final int[] result = new int[p.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = indexes[indexes[i]] + 1;
    }
    return result;
  }


  public static void main(String[] args) {
    int[] ints = permutationEquation(new int[]{2, 3, 1});
    //  System.out.println(Arrays.toString(ints));
  }

}
