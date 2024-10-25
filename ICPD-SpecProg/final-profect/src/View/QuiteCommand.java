package View;

import Command.ICommand;

public class QuiteCommand implements ICommand {
    @Override
    public void execute() {
        System.exit(0);
    }

    @Override
    public String description() {
        return "Выход";
    }
}
