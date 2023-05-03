package prepare.algorithms.warmup;

import java.util.List;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        final int aLength = a.size();
        final int bLength = b.size();
        final int length = Math.max(aLength, bLength);

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < length; i++) {

            if (a.get(i) > b.get(i)) {

                alice++;
            }

            if (a.get(i) < b.get(i)) {

                bob++;
            }
        }

        return List.of(alice, bob);
    }
}
