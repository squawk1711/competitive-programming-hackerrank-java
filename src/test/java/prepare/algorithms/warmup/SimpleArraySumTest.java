package prepare.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SimpleArraySumTest {

    @Test
    void test1() {

        final List<Integer> ar = List.of(1, 2, 3, 4, 10, 11);

        final int expected = SimpleArraySum.simpleArraySum(ar);
        final int actual = 31;

        Assertions.assertEquals(expected, actual);
    }
}