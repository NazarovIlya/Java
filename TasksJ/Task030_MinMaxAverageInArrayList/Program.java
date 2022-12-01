// ДЗ 3.3
// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(
                "Введите ряд чисел. Вводить строго через один пробел.");
        List<String> strList = new ArrayList<String>(
                Arrays.asList(iScanner.nextLine().split(" ")));
        iScanner.close();
        System.out.printf("Исходный список: %s \n", String.join(", ", strList));
        CorrectSymbols(strList);
        System.out.printf("Список без четных чисел: %s \n", String.join(", ", strList));
    }

    public static void CorrectSymbols(List<String> strList) {
        strList.removeAll(Arrays.asList(null, "", null));
        strList.removeAll(Arrays.asList(",", "", null));
        for (int i = 0; i < strList.size() - 1; i++) {
            if (isNotNumeric(strList.get(i)))
                strList.remove(i);
        }
    }

    public static boolean isNotNumeric(String str) {
        try {
            Integer.parseInt(str);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
}
