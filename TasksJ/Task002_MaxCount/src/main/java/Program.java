/*Задание №2
Дан массив двоичных чисел, например [1,1,0,1,1,1],
вывести максимальное количество подряд идущих 1.*/

import java.util.Arrays;

    public class Program {
        public static void main(String[] args) {
            int[] arr = new int[] { 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0 };
            System.out.println("Заданный массив:\t");
            System.out.println(Arrays.toString(arr));
            MaxCount(arr);
        }

        public static void MaxCount(int[] array) {
            int count = 0;
            int max = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    count++;
                    if (max < count)
                        max = count;
                }
                else count = 0;
            }
            System.out.printf("%d ", max);
        }
    }
