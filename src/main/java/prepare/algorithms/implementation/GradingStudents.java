package prepare.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> finalGrades = new ArrayList<>();

        for (int grade : grades) {

            if (grade >= 38 && grade % 5 >= 3) {

                finalGrades.add(grade + (5 - (grade % 5)));
                continue;
            }

            finalGrades.add(grade);
        }

        return finalGrades;
    }
}
