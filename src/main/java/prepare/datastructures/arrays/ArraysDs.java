package prepare.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysDs {

    public static List<Integer> reverseArray(List<Integer> a) {

        final List<Integer> reversedArray = new ArrayList<>();

        for (int i = a.size() - 1; i >= 0; i--) {

            reversedArray.add(a.get(i));
        }

        return reversedArray;
    }
}
