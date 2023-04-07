// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. 
// Необходимо посчитать и вернуть сумму элементов этого массива. 
// При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами 
// (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. 
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

public class main {

    public static void main(String[] args) {

        int[][] arr = { { 2, 6, 2, 4 }, { 2 }, { 1 } };

        int length = arr.length;

        System.out.println(sumElArr(arr));
    }

    public static int sumElemtArray(int[][] array) {
        int lengthRows = array.length;
        int max = 0;
        for (int[] i : array) {
            if (i.length != lengthRows) {
                throw RuntimeException("Arrays aren't ...");
            }

        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i].length);
                if (array[i][j] != 0 || array[i][j] != 1) {
                    throw RuntimeException("Incorrect value.");
                } else {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
