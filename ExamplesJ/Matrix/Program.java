// MATRIX ! ! !

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        for (int i = 0; i < 300; i++) {
            Matrix(ANSI_RESET, ANSI_GREEN);
        }
        while (true) {
            Matrix(ANSI_RESET, ANSI_GREEN);
            TimeUnit.MILLISECONDS.sleep(1);
        }

    }

    public static void Matrix(String reset, String green) {
        Random random = new Random();
        int a = random.nextInt(0, 2);
        int b = random.nextInt(0, 2);
        System.out.print(green + a + reset);
        System.out.print(green + " " + reset);
        System.out.print(green + b + reset);
        System.out.print(green + " " + reset);

    }
}