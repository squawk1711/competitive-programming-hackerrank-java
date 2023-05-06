package prepare.algorithms.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        List<Integer> sortedArr = new ArrayList<>(List.copyOf(arr));
        Collections.sort(sortedArr);

        long sum = 0;
        for (int item : sortedArr) {
            sum += item;
        }

        System.out.printf("%d %d\n", sum - sortedArr.get(sortedArr.size() - 1), sum - sortedArr.get(0));
    }
}
