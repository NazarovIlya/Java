// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. 
// Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int size = 1_000_000;
        int[] arr = new int[size];
        LinkedList<Integer> linkList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        var s = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        System.out.println(System.currentTimeMillis() - s);

        s = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        System.out.println(System.currentTimeMillis() - s);

        s = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkList.add(i);
        }
        System.out.println(System.currentTimeMillis() - s);
    }
}
