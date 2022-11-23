// Написать программу, которая запросит пользовате

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите свое имя:\t");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();
        iScanner.close();
        System.out.printf("Привет, %s!", name);
    }
}
