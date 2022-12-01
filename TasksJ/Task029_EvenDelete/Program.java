// ДЗ 3.2
// Пусть дан произвольный список целых чисел, удалить из него четные числа.

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
            if (Integer.parseInt(strList.get(i)) % 2 == 0)
                strList.remove(i);
        }
    }
}
