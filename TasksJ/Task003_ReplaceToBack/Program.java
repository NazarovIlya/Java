// Задание №3
// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, 
// нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива 
// должны быть отличны от заданного, а остальные - равны ему.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Integer> currentList = new ArrayList<Integer>();
        currentList = InputNumbers(); // ! ITS WORKS!!!
        int length = currentList.get(0);
        int value = currentList.get(1);
        int[] arr = FillArray(length); // new int[] { 3, 2, 2, 3 };
        System.out.println("Исходный массив ");
        System.out.println(Arrays.toString(arr));
        MoveToEnd(arr, value);
        System.out.println("Полученный изменненый массив: ");
        System.out.println(Arrays.toString(arr));
    }

    public static List<Integer> InputNumbers() {
        List<Integer> inputList = new ArrayList<Integer>();
        Scanner iScanner = new Scanner(System.in);
        int number = 0;
        int countElements = 0;
        Boolean check = true;
        while (check) {
            System.out.println("Введите количество элементов массива: ");
            if (iScanner.hasNextInt()) {
                countElements = iScanner.nextInt();
                check = false;
            } else {
                System.out.println("Попробуйте ввести корректное целое число: ");
            }
            System.out.println("Введите число для изменения массива от 1 до 10: ");
            if (iScanner.hasNextInt()) {
                number = iScanner.nextInt();
                check = false;
            } else {
                System.out.println("Попробуйте ввести корректное целое число: ");
            }
        }
        iScanner.close();
        inputList.add(countElements);
        inputList.add(number);
        return inputList;
    }

    public static int[] FillArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 11);
        }
        return array;
    }

    public static void MoveToEnd(int[] array, int value) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] != value) {
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}