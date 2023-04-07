import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. 
// Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
// если длина массива меньше некоторого заданного минимума, метод возвращает -1, 
// в качестве кода ошибки.
// если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// если вместо массива пришел null, метод вернет -3
// придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

// Напишите метод, в котором реализуйте взаимодействие с пользователем. 
// То есть, этот метод запросит искомое число у пользователя, вызовет первый, 
// обработает возвращенное значение и покажет читаемый результат пользователю. 
// Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 8, 9, 245 };

        int num = setNumber();
        // int min = Input();

        int result = checkArray(arr, num, 5);
        if (result == -1) {
            System.out.println("Out of range.");
        } else if (result == -2)
            System.out.println("Can't find...");
        else if (result == -3)
            System.out.println("Array is null");
        else
            System.out.println(result);

        // System.out.println(Task_1(arr, num, min));
    }

    public static int checkArray(int[] array, int number, int min) {
        if (array == null)
            return -3;
        if (array.length < min)
            return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                return i;
        }
        return -2;
    }

    public static int setNumber() {
        int number = 0;
        while (true) {
            try {
                Scanner iScanner = new Scanner(System.in);
                number = iScanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Try again...");
            }
        }
        return number;
    }
}
