// 5.2. Пусть дан список сотрудников:

// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с 
// количеством повторений. Отсортировать по убыванию популярности.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ArrayList<String[]> workers = ReadFromFile();
        HashMap<String, Integer> frequency = Counter(workers);
        System.out.printf("Частнотный словарь имен:\n%s\n", frequency.toString());
    }

    public static HashMap<String, Integer> Counter(ArrayList<String[]> workers) {
        HashMap<String, Integer> counter = new HashMap<>();
        List<String> names = new ArrayList<String>();
        for (int i = 0; i < workers.size(); i++) {
            names.add(workers.get(i)[0]);
        }
        for (int i = 0; i < workers.size(); i++) {
            int count = Collections.frequency(names, workers.get(i)[0]);
            counter.put(workers.get(i)[0], count);
        }
        return counter;
    }

    public static ArrayList<String[]> ReadFromFile() {
        ArrayList<String[]> workers = new ArrayList<>();
        try {
            File file = new File("workers.txt");
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);
            String line = bReader.readLine();
            workers.add(line.split(" "));
            while (line != null) {
                line = bReader.readLine();
                workers.add(line.split(" "));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(String.join("", Collections.nCopies(50, "=*")));
            System.out.println("Файл прочитан.");
        }
        return workers;
    }
}
