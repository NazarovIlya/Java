// Задание №3
// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, 
// нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива 
// должны быть отличны от заданного, а остальные - равны ему.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Integer> currentList = new ArrayList<Integer>();
        currentList = InputNumbers(); // ! ITS WORKS!!!
    }

    public static List InputNumbers() {
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
            System.out.println("Введите число для изменения массива: ");
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
}