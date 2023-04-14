import java.util.Arrays;

import javax.print.attribute.standard.Fidelity;

// 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен сумме элементов 
// двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class main {
    public static void main(String[] args) {
        int[] firstArr = { 2, 5, 6 };
        int[] secondArr = { 6, 1, 2 };
        int[] thirdArr = { 4, 3 };

        int[] arr = sumElemetsOfTwoArrays(firstArr, thirdArr);
        System.out.println(Arrays.toString(arr));

        arr = sumElemetsOfTwoArrays(firstArr, secondArr);
    }

    public static int[] sumElemetsOfTwoArrays(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length];
        try {
            if (firstArray.length == secondArray.length) {
                for (int i = 0; i < firstArray.length; i++) {
                    newArray[i] = firstArray[i] + secondArray[i];
                }
            } else {
                throw new RuntimeException("Array lengths are not equal.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

        return newArray;

    }
}
