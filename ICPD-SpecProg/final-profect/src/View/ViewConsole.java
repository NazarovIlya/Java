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
        Scanner scanner = new Scanner(System.in);

        return index;
    }
}