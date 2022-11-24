import java.util.Arrays;
import java.util.Scanner;

// Семинар 1, задание 3.
// Реализовать простой калькулятор: +, -, /, *

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Введите врыжение, результат, которого Вы хотите узнать. Например '2 * 2'. Вводить строго через один пробел.");
        String[] ArrayString = iScanner.nextLine().split(" ");
        iScanner.close();
        double firstNum = Double.parseDouble((ArrayString[0]));
        char mathSymbol = ArrayString[1].charAt(0);
        double secondNum = Double.parseDouble((ArrayString[2]));
        System.out.printf("%.2f %c %.2f\n", firstNum, mathSymbol, secondNum);
        double result = Action(firstNum, mathSymbol, secondNum);
        System.out.printf("%f %c %f = %f\n", firstNum, mathSymbol, secondNum, result);

    }

    public static double Action(double first, char symbol, double second) {
        double res = 0;
        switch (symbol) {
            case '+':
                res = Sum(first, second);
            case '-':
                res = Sub(first, second);
                break;
            case '*':
                res = Multi(first, second);
                break;
            case '/':
                res = Div(first, second);
                break;
            case '%':
                res = ModDiv(first, second);
                break;
            // default:
            // System.out.println("Ошибка.");
            // break;
        }
        return res;
    }

    public static double Sum(double first, double second) {
        return first + second;
    }

    public static double Sub(double first, double second) {
        return first - second;
    }

    public static double Multi(double first, double second) {
        return first * second;
    }

    public static double Div(double first, double second) {
        return first / second;
    }

    public static double ModDiv(double first, double second) {
        return first % second;
    }

    public static double Power(double first, double second) {
        double result = first;
        for (int i = 0; i < second; i++) {
            result *= first;
        }
        return result;
    }
}
