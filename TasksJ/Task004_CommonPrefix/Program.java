// Задание №4 
// Напишите метод, который находит самую длинную строку общего префикса
// среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите набор слов для нахождения общего префикса: ");
        List<String> userLines = Arrays.asList(iScanner.nextLine().split(" "));
        iScanner.close();
        String prefixResult = FindLCPrefix(userLines);
        System.out.printf("Самый длинный общий префикс: %s", prefixResult);
    }

    public static String LongestCommonPrefix(String first, String second) {
        int i = 0;
        int j = 0;
        while (i < first.length() && j < second.length()) {
            if (first.charAt(i) != second.charAt(j)) {
                break;
            }
            i++;
            j++;
        }
        return first.substring(0, i);
    }

    public static String FindLCPrefix(List<String> lines) {
        String prefix = lines.get(0);
        for (String str : lines) {
            prefix = LongestCommonPrefix(prefix, str);
        }
        return prefix;
    }
}