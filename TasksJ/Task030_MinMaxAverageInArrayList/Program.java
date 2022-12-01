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
        System.out.printf("Заданный список: %s \n", String.join(", ", strList));
        CorrectSymbols(strList);
        int min = MixInt(strList);
        int max = MaxInt(strList);
        double average = Average(strList);
        System.out.printf("В списке минимальное число -%d, максимальное - %d, среднее - %f.2", min, max, average);
    }

    public static int MixInt(List<String> listNumbers) {
        int min = Integer.parseInt(listNumbers.get(0));
        for (int i = 0; i < listNumbers.size(); i++) {
            if (Integer.parseInt(listNumbers.get(i)) < min)
                min = Integer.parseInt(listNumbers.get(i));
        }
        return min;
    }

    public static int MaxInt(List<String> listNumbes) {
        int max = Integer.parseInt(listNumbes.get(0));
        for (int i = 0; i < listNumbes.size(); i++) {
            if (Integer.parseInt(listNumbes.get(i)) > max)
                max = Integer.parseInt(listNumbes.get(i));
        }
        return max;
    }

    public static double Average(List<String> listNumbers) {
        double sum = 0;
        for (int i = 0; i < listNumbers.size(); i++) {
            sum += Double.parseDouble(listNumbers.get(i));
        }
        double average = sum / listNumbers.size();
        return average;
    }

    public static void CorrectSymbols(List<String> strList) {
        strList.removeAll(Arrays.asList(null, "", null));
        strList.removeAll(Arrays.asList(",", "", null));
    }
}