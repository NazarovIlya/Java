// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:	“Введите цифру, соответствующую необходимому критерию:	1 - RAM
// 	2 - Объем HD
// 	3 - Операционная система
// 	4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package Task055_NotebookInfo;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Notebook> notebooks = new ArrayList<>();
        // Заполняем список:
        notebooks.add(new Notebook(notebooks.size(), "Apple", "MacBook Pro", "Silver", 13.3, "M2", "SSD", 3.2, 32, 1024,
                "MacOS"));
        notebooks.add(
                new Notebook(notebooks.size(), "Huawei", "MateBook 14", "Grey", 14.2, "AMD Ryzen", "SSD", 2.2, 16, 512,
                        "Windows 10"));
        notebooks.add(
                new Notebook(notebooks.size(), "Asus", "Vivobook Go 14", "Black", 14, "Intel Pentium", "SSD", 1.1, 8,
                        256, "no OS"));
        notebooks.add(
                new Notebook(notebooks.size(), "Huawei", "MateBook D14", "Silver", 14, "Intel Core", "SSD", 2.4, 8, 512,
                        "Windows"));
        notebooks.add(new Notebook(notebooks.size(), "Hauwei", "MateBook D 15", "Grey",
                15.6, "Intel Core", "SSD", 2.8, 16, 512, "Windows"));
        notebooks.add(new Notebook(notebooks.size(), "Asus", "TUF Gaming F15",
                "Grey", 15.6, "Intel Core", "SSD", 2.7, 16, 512, "no OS"));
        notebooks.add(
                new Notebook(notebooks.size(), "Huawei", "MateBook D16", "Space grey", 16, "Intel Core", "SSD", 3.3,
                        16, 512, "Windows"));
        notebooks.add(new Notebook(notebooks.size(), "Honor", "MagicBook 16", "Space grey",
                16.1, "AMD Ryzen", "SSD", 3.3, 16, 512, "Windows"));
        notebooks.add(new Notebook(notebooks.size(), "Apple", "MacBook Pro 14",
                "Space grey", 14.2, "M1", "SSD", 3.2, 16, 1024, "MacOS"));
        notebooks.add(new Notebook(notebooks.size(), "Apple", "MacBook Air",
                "Black", 13.6, "M2", "SSD", 3.5, 8, 256, "MacOS"));

        // Вывести все экзепляры класса Notebook
        for (Notebook notebook : notebooks) {
            System.out.println(notebook.getInfo());
            System.out.println();
        }
        NotebookInfo notebookList = new NotebookInfo(notebooks);
        List<Notebook> filterList = notebookList.View();
        System.out.println(filterList.size());
        for (Notebook notebook : filterList) {
            System.out.println(notebook.getInfo());
            System.out.println();
        }
    }
}