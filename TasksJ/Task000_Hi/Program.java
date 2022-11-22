import java.util.Scanner;

// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную с
    
public class Program {
    public static void main(String[] args) {
        System.out.println("Введите свое имя:\t");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
    }
}


