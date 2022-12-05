// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количество элементов списка.");
        int size = iScanner.nextInt();
        // iScanner.close();
        LinkedList<Integer> linkedList = CreateNFillLinkedList(size);
        System.out.printf("Исходный список: %s\n", linkedList);
        System.out.println("Введите значение нового элемента: ");
        int newEl = iScanner.nextInt();
        iScanner.close();
        Enqueue(linkedList, newEl);
        System.out.printf("Cписок с добавленным элементом %s: %s\n", newEl, linkedList);
        int res = Dequeue(linkedList);
        System.out.printf("Cписок: %s,\nПервый элемент списка, который был удален %s\n", linkedList, res);
        res = First(linkedList);
        System.out.printf("Cписок: %s,\nПервый элемент списка, который не был удален %s\n", linkedList, res);
    }

    public static LinkedList<Integer> CreateNFillLinkedList(int size) {
        Random rnd = new Random();
        LinkedList<Integer> lnkList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            lnkList.add(rnd.nextInt(0, 100));
        }
        return lnkList;
    }

    public static void Enqueue(LinkedList<Integer> queue, int element) {
        queue.addLast(element);
    }

    public static int Dequeue(LinkedList<Integer> queue) {
        int firstElement = queue.poll();
        return firstElement;
    }

    public static int First(LinkedList<Integer> queue) {
        int first = queue.getFirst();
        return first;
    }
}