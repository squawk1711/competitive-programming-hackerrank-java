package prepare.algorithms.warmup;

public class Staircase {

    public static void staircase(int n) {

        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n - j - 1) stringBuilder.append(" ");
                else stringBuilder.append("#");
            }
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {

        staircase(6);
    }
}
