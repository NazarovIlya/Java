// 1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

public class main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[] { 3, null, 0, 6, null, 8 };

        checkArray(arr);
        checkArray(null);
    }

    public static void checkArray(Integer[] array) {
        try {
            if (array == null) {
                throw new IllegalArgumentException("Arrays is null");
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    continue;
                } else {
                    System.out.println("Null found on position " + i);
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
