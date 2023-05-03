package prepare.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DiagonalDifferenceTest {

    @Test
    void test1() {

        final List<List<Integer>> arr = List.of(
                List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12)
        );

        final int expected = 15;
        final int actual = DiagonalDifference.diagonalDifference(arr);

        Assertions.assertEquals(expected, actual);
    }
}