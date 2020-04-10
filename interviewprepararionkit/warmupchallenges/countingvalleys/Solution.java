package warmupchallenges.countingvalleys;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int numberofvalleys = 0;
        int sealevel = 0;
        char[] chars = s.toCharArray();
        for (char c : chars
        ) {
            if (c == 'U') {
                sealevel = sealevel + 1;
                if (sealevel == 0) {
                    numberofvalleys = numberofvalleys + 1;
                }
            } else if (c == 'D') {
                sealevel = sealevel - 1;
            }
        }
        System.out.println("numberof valleys " + numberofvalleys);
        return numberofvalleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = 8;
        String s = "UDDDUDUU";
        int result = countingValleys(n, s);
        System.out.println(result);

    }
}

