// 5.1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя контакта и номер телефона знак тильда '~':\n"
                    + "Нажмите ввод для выхода.");
            String[] userInput = iScanner.nextLine()
                    .replaceAll(" ", "")
                    .split("~");
            if (userInput.length < 2) {
                System.out.println("Выход...");
                break;
            } else {
                if (!CheckString(userInput))
                    continue;
                String name = userInput[0];
                String phone = userInput[1];
                addContact(phoneBook, name, phone);
            }
            System.out.printf("Сформированный справочник %s\n",
                    phoneBook.toString());
        }
        iScanner.close();
    }

    public static boolean CheckString(String[] inpuString) {
        if (inpuString[0] == "" || inpuString[1] == "")
            return false;
        return true;
    }

    public static void addContact(HashMap<String, ArrayList<String>> book, String name, String phone) {
        if (book.containsKey(name)) {
            var item = book.get(name);
            if (item == null) {
                item = new ArrayList<String>();
            }
            if (!item.contains(phone))
                item.add(phone);
            else
                System.out.println("У данного абонента такой номер уже есть");
        } else {
            var item = new ArrayList<String>();
            item.add(phone);
            book.put(name, item);
        }
    }
}
