import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(inpFloat());
    }

    public static float inpFloat() {

        Scanner scanner = new Scanner(System.in);
        float input = 0.0F;

        System.out.println("Введите число типа float c точкой: ");

        while (scanner.hasNextFloat()) {
            input = scanner.nextFloat();
            System.out.println("Введите число используя точку! Неверный ввод!");
        }
        scanner.close();
        return input;
    }
}