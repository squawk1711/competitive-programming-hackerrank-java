package prepare.algorithms.warmup;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        final double length = arr.size();

        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (int item : arr) {

            if (item > 0) positive++;
            if (item < 0) negative++;
            if (item == 0) zero++;
        }

        System.out.printf("""
                %.6f
                %.6f
                %.6f""", positive / length, negative / length, zero / length);
    }
}
