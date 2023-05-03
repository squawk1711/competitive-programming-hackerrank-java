package prepare.algorithms.warmup;

import java.util.List;

public class AVeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {

        long sum = 0;
        for (long item : ar) {

            sum += item;
        }

        return sum;
    }
}
