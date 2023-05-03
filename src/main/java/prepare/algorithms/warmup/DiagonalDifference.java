package prepare.algorithms.warmup;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        final int rowColLength = arr.size();

        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < rowColLength; i++) {

            diagonal1 += arr.get(i).get(i);
            diagonal2 += arr.get(rowColLength - 1 - i).get(i);
        }

        return Math.abs(diagonal1 - diagonal2);
    }
}
