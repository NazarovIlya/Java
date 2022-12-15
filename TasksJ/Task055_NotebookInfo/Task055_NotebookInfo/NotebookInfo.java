package Task055_NotebookInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotebookInfo {
    private List<Notebook> notebooks;

    public NotebookInfo(List<Notebook> notebooks) {
        this.notebooks = notebooks;
    }

    public NotebookInfo() {
    }

    public List<Notebook> View() {
        int userChoice = OutputView();
        List<Notebook> resulList = Filter(userChoice);
        return resulList;
    }

    private int OutputView() {
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
        // iScanner.close();
        return choice;
    }

    private List<Notebook> Filter(int choice) {
        List<Notebook> filterList = new ArrayList<>();
        int value = 0;
        double dValue = 0;
        String sValue = null;
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите наименование критерия (например 'Intel Core' для фильтрации)");
        switch (choice) {
            case 1:
                value = iScanner.nextInt();
                for (Notebook notebook : this.notebooks) {
                    if (notebook.getID() == value)
                        filterList.add(notebook);
                }
                break;
            case 9:
                value = iScanner.nextInt();
                for (Notebook notebook : this.notebooks) {
                    if (notebook.getRAM() == value)
                        filterList.add(notebook);
                }
                break;
            case 10:
                value = iScanner.nextInt();
                for (Notebook notebook : this.notebooks) {
                    if (notebook.getDiskValue() == value)
                        filterList.add(notebook);
                }
                break;
            case 5:
                dValue = iScanner.nextDouble();
                for (Notebook notebook : this.notebooks) {
                    if (notebook.getDiagonal() == dValue)
                        filterList.add(notebook);
                }
                break;
            case 8:
                dValue = iScanner.nextDouble();
                for (Notebook notebook : this.notebooks) {
                    if (notebook.getCPUFrequency() == dValue)
                        filterList.add(notebook);
                }
                break;
            case 2:
                sValue = iScanner.nextLine();
                System.out.printf("string value: %s\n", sValue);
                for (int i = 0; i < notebooks.size() - 1; i++) {
                    if (sValue.equals(notebooks.get(i).getManufactorer())) {
                        filterList.add(notebooks.get(i));
                    }
                }
                break;
            case 3:
                sValue = iScanner.nextLine();
                for (int i = 0; i < notebooks.size() - 1; i++) {
                    if (sValue.equals(notebooks.get(i).getModel())) {
                        filterList.add(notebooks.get(i));
                    }
                }
                break;
            case 4:
                sValue = iScanner.nextLine();
                for (int i = 0; i < notebooks.size() - 1; i++) {
                    if (sValue.equals(notebooks.get(i).getColour())) {
                        filterList.add(notebooks.get(i));
                    }
                }
                break;
            case 6:
                sValue = iScanner.nextLine();
                for (int i = 0; i < notebooks.size() - 1; i++) {
                    if (sValue.equals(notebooks.get(i).getCPUType())) {
                        filterList.add(notebooks.get(i));
                    }
                }
                break;
            case 7:
                sValue = iScanner.nextLine();
                for (int i = 0; i < notebooks.size() - 1; i++) {
                    if (sValue.equals(notebooks.get(i).getDiskType())) {
                        filterList.add(notebooks.get(i));
                    }
                }
                break;
            case 11:
                sValue = iScanner.nextLine();
                for (int i = 0; i < notebooks.size() - 1; i++) {
                    if (sValue.equals(notebooks.get(i).getOSType())) {
                        filterList.add(notebooks.get(i));
                    }
                }
                break;
            default:
                System.out.println("Ошибка ввода. Нет такого значения.");
                break;
        }
        // iScanner.close();
        return filterList;
    }
}