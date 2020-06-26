package implementation.viraladvertising;

public class Solution {

  static int viralAdvertising(int n) {
    int numberOfInvitationSent = 5;
    int liked = 0;
    for (int i = 1; i <= n; i++) {
      double floor = Math.floor(numberOfInvitationSent >> 1);
      liked = liked + (int) floor;
      numberOfInvitationSent = (int) floor * 3;
    }

    return liked;
  }

  public static void main(String[] args) {
    System.out.println(viralAdvertising(3));
  }

}
