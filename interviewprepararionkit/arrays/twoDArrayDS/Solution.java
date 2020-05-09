import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        List<List<Integer>> hourGlasses = new ArrayList<>();
        List<Integer> sums = new ArrayList<>();

        for (int i = 0; i <= arr.length-3 ; i++) {
            for (int j = 0; j <= arr.length-3 ; j++) {
                List<Integer> hourglass = new ArrayList<>();
                hourglass.add(arr[i][j]);
                hourglass.add(arr[i][j+1]);
                hourglass.add(arr[i][j+2]);
                hourglass.add(arr[i+1][j+1]);
                hourglass.add(arr[i+2][j]);
                hourglass.add(arr[i+2][j+1]);
                hourglass.add(arr[i+2][j+2]);

                hourGlasses.add(hourglass);
            }
        }
        for (List<Integer> hourglass: hourGlasses
        ) {
            IntSummaryStatistics collect = hourglass.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
            sums.add((int) collect.getSum());
        }
        Collections.sort(sums);
        Collections.reverse(sums);
        return sums.get(0);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
