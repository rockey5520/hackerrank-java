package arrays.newyearchaos;

import java.util.Scanner;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] input) {
        int bribes = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] != i + 1) {
                if (((i - 1) >= 0) && input[i - 1] == (i + 1)) {
                    bribes++;
                    swap(input, i, i - 1);
                } else if (((i - 2) >= 0) && input[i - 2] == (i + 1)) {
                    bribes += 2;
                    swap(input, i - 2, i - 1);
                    swap(input, i - 1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(bribes);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] input = new int[]{1,2,5,3,7,8,6,4};
        minimumBribes(input);
    }
}