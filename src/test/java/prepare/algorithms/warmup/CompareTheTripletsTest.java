package prepare.algorithms.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CompareTheTripletsTest {

    @Test
    void test1() {

        final List<Integer> a = List.of(5, 6, 7);
        final List<Integer> b = List.of(3, 6, 10);

        final List<Integer> expected = List.of(1, 1);
        final List<Integer> actual = CompareTheTriplets.compareTriplets(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final List<Integer> a = List.of(17, 28, 30);
        final List<Integer> b = List.of(99, 16, 8);

        final List<Integer> expected = List.of(2, 1);
        final List<Integer> actual = CompareTheTriplets.compareTriplets(a, b);

        Assertions.assertEquals(expected, actual);
    }
}