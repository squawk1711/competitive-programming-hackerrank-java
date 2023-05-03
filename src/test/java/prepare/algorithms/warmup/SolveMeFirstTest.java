package prepare.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolveMeFirstTest {

    @Test
    void test1() {

        final int a = 2;
        final int b = 3;

        final int expected = SolveMeFirst.sum(a, b);
        final int actual = 5;

        Assertions.assertEquals(expected, actual);
    }
}