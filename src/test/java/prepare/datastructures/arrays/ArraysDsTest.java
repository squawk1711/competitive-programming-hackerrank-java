package prepare.datastructures.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ArraysDsTest {

    @Test
    void test1() {

        final List<Integer> a = List.of(1, 4, 3, 2);

        final List<Integer> expected = List.of(2, 3, 4, 1);
        final List<Integer> actual = ArraysDs.reverseArray(a);

        Assertions.assertEquals(expected, actual);
    }
}