package View;

import Command.ICommand;
import Logic.UniversityService;

public class QuiteCommand implements ICommand {
    private UniversityService service;
    private ViewConsole view;

    public QuiteCommand(UniversityService service){
        this.service = service;
    }
    @Override
    public void execute() {
        service.setRunStatus(false);
        System.out.println("Программа завершила свое выполнение");
    }

    @Override
    public String description() {
        return "Выход";
    }
}
