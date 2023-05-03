package prepare.algorithms.warmup;

import java.util.List;

public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {

        int sum = 0;
        for (int item : ar) {

            sum += item;
        }

        return sum;
    }
}
