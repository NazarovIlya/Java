package Task053_Notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotebookInfo {
    static List<Notebook> notebooks;

    public NotebookInfo(List<Notebook> notebooks) {
        this.notebooks = notebooks;
    }

    public NotebookInfo() {
    }

    public static void View() {
        int userChoice = OutputView();
        Filter(userChoice);
    }

    private static int OutputView() {
        int choice = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.println("По какому критерию Вы хотите отобрать ноутбуки?\n"
                + "Введите цифру, соответствующую Вашему выбору:\n"
                + "1 - ID товара.\n"
                + "2 - Производитель.\n"
                + "3 - Модель.\n"
                + "4 - Цвет.\n"
                + "5 - Диагональ.\n"
                + "6 - Тип процессора (ЦП)\n"
                + "7 - Тип основного носителя информации\n"
                + "8 - Частота ЦП\n"
                + "9 - Объем оперативной памяти (RAM)\n"
                + "10 - Объем основного носителя информации\n"
                + "11 - Тип операционной системы\n");
        if (iScanner.hasNextInt())
            choice = iScanner.nextInt();
        else
            System.out.println("Ошибка ввода.");
        iScanner.close();
        return choice;
    }

    private static void Filter(int choice) {
        List<Notebook> filterList = new ArrayList<>();
        int value = 0;
        double dValue = 0;
        String sValue = null;
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите наименование критерия (например 'Intel Core' для фильтрации)");
        switch (choice) {
            case 1:
                value = iScanner.nextInt();
                for (Notebook notebook : notebooks) {
                    if (notebook.getID() == value)
                        filterList.add(notebook);
                }
                break;
            case 9:
                value = iScanner.nextInt();
                for (Notebook notebook : notebooks) {
                    if (notebook.getRAM() == value)
                        filterList.add(notebook);
                }
                break;
            case 10:
                value = iScanner.nextInt();
                for (Notebook notebook : notebooks) {
                    if (notebook.getDiskValue() == value)
                        filterList.add(notebook);
                }
                break;
            case 5:
                dValue = iScanner.nextDouble();
                for (Notebook notebook : notebooks) {
                    if (notebook.getDiagonal() == dValue)
                        filterList.add(notebook);
                }
                break;
            case 8:
                dValue = iScanner.nextDouble();
                for (Notebook notebook : notebooks) {
                    if (notebook.getCPUFrequency() == dValue)
                        filterList.add(notebook);
                }
                break;
            case 2:
                sValue = iScanner.nextLine();
                for (Notebook notebook : notebooks) {
                    if (notebook.getManufactorer() == sValue)
                        filterList.add(notebook);
                }
                break;
            case 3:
                sValue = iScanner.nextLine();
                for (Notebook notebook : notebooks) {
                    if (notebook.getModel() == sValue)
                        filterList.add(notebook);
                }
                break;
            case 4:
                sValue = iScanner.nextLine();
                for (Notebook notebook : notebooks) {
                    if (notebook.getColour() == sValue)
                        filterList.add(notebook);
                }
                break;
            case 6:
                sValue = iScanner.nextLine();
                for (Notebook notebook : notebooks) {
                    if (notebook.getCPUType() == sValue)
                        filterList.add(notebook);
                }
                break;
            case 7:
                sValue = iScanner.nextLine();
                for (Notebook notebook : notebooks) {
                    if (notebook.getDiskType() == sValue)
                        filterList.add(notebook);
                }
                break;
            case 11:
                sValue = iScanner.nextLine();
                for (Notebook notebook : notebooks) {
                    if (notebook.getOSType() == sValue)
                        filterList.add(notebook);
                }
                break;
            default:
                System.out.println("Ошибка ввода. Нет такого значения.");
                break;
        }
        iScanner.close();
    }
}
