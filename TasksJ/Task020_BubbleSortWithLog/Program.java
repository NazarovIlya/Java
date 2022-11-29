// ДЗ 2.2. 
// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.security.cert.CertPath;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[] { 44, 8, 1, -7, 4, -34, -55 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            WriteToFile(array);
        }
    }

    public static void WriteToFile(int[] inputArray) {
        try (FileWriter f = new FileWriter("log_iteration.txt", true)) {
            f.write(Arrays.toString(inputArray));
            f.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
