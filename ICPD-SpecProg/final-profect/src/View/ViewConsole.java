package View;

import Command.ICommand;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewConsole implements IView {
    private ArrayList<ICommand> commands;

    public ViewConsole(ArrayList<ICommand> commands) {
        this.commands = commands;
    }

    @Override
    public int menu() {
        int size = this.commands.size();
        System.out.println("Выберите пункт меню из списка:");
        for (int i = 0; i < size; i++) {
            System.out.println(String.format("%d --> %s", i, this.commands.get(i).description()));
        }
        return menuIndex(size);
    }

    private int menuIndex(int size){
        boolean flag = true;
        int index = 0;
        String input = "";
        //String regex = String.format("^[0-9]?$", size - 1);
        String regex = String.format("^(%d|(1[0%d]|[0-9]{1}))$", size - 1, size - 11);

        Scanner scanner = new Scanner(System.in);

        while(flag){
            input = scanner.nextLine();
            if (!input.isEmpty() && isDigit(input) && input.matches(regex)) {
                index = Integer.parseInt(input);
                flag = false;
            }
            if(!input.matches(regex)){
                System.out.println("Введите корректное число:");
            }
        }
        return index;
    }

    private boolean isDigit(String line) {
        char[] c = line.toCharArray();
        if (Character.isDigit(c[0])) {
            return true;
        }
        return false;
    }
}