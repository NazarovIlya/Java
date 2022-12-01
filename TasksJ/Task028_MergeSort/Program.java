
// ДЗ 3.1
// Реализовать алгоритм сортировки слиянием.
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] myArray = new int[] { 9, 4, 7, 1, 8, 3, 5, 2, 6 };
        System.out.print("Исходный массив:\t");
        System.out.println(Arrays.toString(myArray));
        MergeSortRecursive(myArray, 0, myArray.length - 1);
        System.out.print("Отсортированный массив:\t");
        System.out.println(Arrays.toString(myArray));
    }

    public static void Merge(int[] array, int lowIndex, int middleIndex, int highIndex) {
        int left = lowIndex;
        int right = middleIndex + 1;
        int[] tempArray = new int[highIndex - lowIndex + 1];
        int index = 0;
        while ((left <= middleIndex) && (right <= highIndex)) {
            if (array[left] < array[right]) {
                tempArray[index] = array[left];
                left++;
            } else {
                tempArray[index] = array[right];
                right++;
            }
            index++;
        }

        for (int i = left; i <= middleIndex; i++) {
            tempArray[index] = array[i];
            index++;
        }

        for (int i = right; i <= highIndex; i++) {
            tempArray[index] = array[i];
            index++;
        }

        for (int i = 0; i < tempArray.length; i++) {
            array[lowIndex + i] = tempArray[i];
        }
    }

    public static int[] MergeSortRecursive(int[] array, int lowIndex, int highIndex) {
        if (lowIndex + 1 <= highIndex) {
            int middle = (lowIndex + highIndex) / 2;
            MergeSortRecursive(array, lowIndex, middle);
            MergeSortRecursive(array, middle + 1, highIndex);
            Merge(array, lowIndex, middle, highIndex);
        }
        return array;
    }
}
