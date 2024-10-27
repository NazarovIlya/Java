package View;

import Command.ICommand;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewConsole implements IView {

    @Override
    public int menu(ArrayList<ICommand> commands) {
        for (int i = 0; i < commands.size(); i++) {
            System.out.println(String.format("%d --> %s", i, commands.get(i).description()));
        }
        return menuIndex(commands.size());
    }

    private int menuIndex(int size){
        boolean flag = true;
        int index = 0;
        String input = "";
        String regex = String.format("^[0-%d]$", size);
        Scanner scanner = new Scanner(System.in);

        while(flag){
            System.out.println("Выберите пункт меню из списка:");
            input = scanner.nextLine();
            if (!input.isEmpty() && isDigit(input) && input.matches(regex)) {
                index = Integer.parseInt(input);
                flag = false;
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