import java.util.Scanner;

// Семинар 1, задание 1. 
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        iScanner.close();
        int sumResult = SumToN(num);
        int factorial = Factorial(num);
        System.out.printf("Сумма чисел от 1 до %d: %d.\n", num, sumResult);
        System.out.printf("%d факториал: %d.", num, factorial);

    }

    public static int SumToN(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int Factorial(int number) {
        if (number == 1)
            return 1;
        return number * Factorial(number - 1);
    }
}