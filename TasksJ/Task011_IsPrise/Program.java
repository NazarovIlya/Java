// Семинар 1, задание 2. 
// Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Ввести целое число:");
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        iScanner.close();
        for (int i = 2; i <= num; i++) {
            if (IsPrise(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static Boolean IsPrise(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
