package prepare.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AVeryBigSumTest {

    @Test
    void test1() {

        final List<Long> ar = List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);

        final long expected = 5000000015L;
        final long actual = AVeryBigSum.aVeryBigSum(ar);

        Assertions.assertEquals(expected, actual);
    }
}