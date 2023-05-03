package prepare.algorithms.warmup;

import java.util.Scanner;

public class SolveMeFirst {

    public static int sum(final int a, final int b) {

        return a + b;
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        final int result = sum(a, b);

        System.out.printf("%d\n", result);
    }
}
