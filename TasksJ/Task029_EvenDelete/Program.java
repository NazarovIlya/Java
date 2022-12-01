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
    }

    public static int MixInt(List<String> listNumbers) {
        int min = Integer.parseInt(listNumbers.get(0));
        for (int i = 0; i < listNumbers.size() - 1; i++) {
            if (Integer.parseInt(listNumbers.get(i)) < min)
                min = Integer.parseInt(listNumbers.get(i));
        }
        return min;
    }

    public static int MaxInt(List<String> listNumbes){
        int max = Integer.parseInt(listNumbes.get(0));
        for (int i = 0; i < listNumbes.size() - 1; i++) {
            if(Integer.parseInt(listNumbes.get(i)) > max max = Integer.parseInt(Integer.parseInt(null))
        }
        return max;
    }

    public static void CorrectSymbols(List<String> strList) {
        strList.removeAll(Arrays.asList(null, "", null));
        strList.removeAll(Arrays.asList(",", "", null));
    }
}
