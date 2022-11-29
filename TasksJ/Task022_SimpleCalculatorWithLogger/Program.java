// ДЗ 4 *.
// К калькулятору из предыдущего дз добавить логирование.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;
import java.io.FileWriter;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Введите врыжение, результат, которого Вы хотите узнать.\nНапример '2 * 2'. Вводить строго через один пробел.");
        List<String> arr = new ArrayList<String>(
                Arrays.asList(iScanner.nextLine().split(" ")));
        iScanner.close();
        System.out.println();
        arr.removeAll(Arrays.asList("", ",", null));

        double firstNum = Double.parseDouble(arr.get(0));
        char mathSymbol = arr.get(1).charAt(0);
        double secondNum = Double.parseDouble(arr.get(2));
        double result = Action(firstNum, mathSymbol, secondNum);

        String resultString = String.format("%.2f %c %.2f = %.2f\n",
                firstNum, mathSymbol, secondNum, result);
        CalcLogger(resultString);
        System.out.printf(resultString);
    }

    public static void CalcLogger(String resultString) {

        Logger logger = Logger.getLogger(Program.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.setLevel(Level.ALL);
        SimpleFormatter sFormatter = new SimpleFormatter();
        ch.setFormatter(sFormatter);
        logger.info(resultString);
        WriteToFile(resultString);
    }

    public static void WriteToFile(String log) {
        try (FileWriter f = new FileWriter("log.txt", true)) {
            f.write(log);
            f.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double Action(double first, char symbol, double second) {
        double res = 0;
        switch (symbol) {
            case '+':
                res = Sum(first, second);
                break;
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
            case '^':
                res = Power(first, second);
                break;
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
        for (int i = 1; i < second; i++) {
            result *= result;
        }
        return result;
    }
}
