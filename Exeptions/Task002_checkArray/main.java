// 1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

public class main {
    public static void main(String[] args) {

        int[] arr = new int[] { 3, 6, 0, 3, 0, 3 };

        checkArray(arr);
    }

    public static void checkArray(int[] array) {
        if (array == null) {
            throw IllegalArgumentException("Arrays is null");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                continue;
            } else {
                System.out.println("Null found on position " + i);
            }
        }
    }
}