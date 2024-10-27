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
        return 0;
    }

    private int menuIndex(){
        boolean flag = true;
        int index = 0;
        String input = "";
        String regex = "^[0-1]+$";
        Scanner scanner = new Scanner(System.in);

        while(flag){
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