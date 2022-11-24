// Задание №5 (доп)
// Во фразе "Добро пожаловать на курс по Java" 
// переставить слова в обратном порядке.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String[] inputList = iScanner.nextLine().split(" ");
        iScanner.close();
        String result = ReverseString(inputList);
        System.out.println(result);
    }

    public static String ReverseString(String[] array) {
        String str = "";
        int length = array.length;
        for (int i = 0; i < length; i++) {
            str += array[length - i - 1];
            str += " ";
        }
        return str;
    }
}
