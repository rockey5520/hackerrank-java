package warmupchallenges.sockmerchant;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int a : ar) {
            int pointer = a;
            int count = 0;
            for (int b : ar) {
                if (b == a) {
                    count++;
                }
                m.put(a, count);
            }
        }
        int numberofpairs = 0;
        for (int x : m.values()
        ) {
            int numberofpairs_tmp = 0;
            if (x > 1) {
                if (x % 2 == 0) {
                    numberofpairs_tmp = x / 2;
                } else {
                    numberofpairs_tmp = (x - 1) / 2;
                }
            }
            numberofpairs = numberofpairs + numberofpairs_tmp;
        }
        return numberofpairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] a = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(9, a));

    }
}
