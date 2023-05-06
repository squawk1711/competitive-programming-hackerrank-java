package prepare.algorithms.warmup;

import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {

        int tallest = Integer.MIN_VALUE;
        for (int candle : candles) {
            if (tallest < candle) {
                tallest = candle;
            }
        }

        int count = 0;
        for (int candle : candles) {
            if (candle == tallest) {
                count++;
            }
        }

        return count;
    }
}
