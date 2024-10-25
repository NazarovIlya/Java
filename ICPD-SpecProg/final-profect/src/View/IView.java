package View;

import Command.ICommand;

import java.util.ArrayList;

public interface IView {
    int menu(ArrayList<ICommand> commands);
}
