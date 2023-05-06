package prepare.algorithms.implementation;

import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int appleCount = 0;
        int orangeCount = 0;
        for (int apple : apples) {
            if (apple + a >= s && apple + a <= t) {
                appleCount++;
            }
        }
        for (int orange : oranges) {
            if (orange + b >= s && orange + b <= t) {
                orangeCount++;
            }
        }

        System.out.printf("%d\n%d\n", appleCount, orangeCount);
    }
}
