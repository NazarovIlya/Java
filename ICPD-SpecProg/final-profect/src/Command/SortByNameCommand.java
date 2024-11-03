package Command;

import Logic.UniversityService;

public class SortByNameCommand implements ICommand{
    private UniversityService service;

    public SortByNameCommand(UniversityService service){
        this.service = service;
    }
    @Override
    public void execute() {
        service.sortByNameAZ();
    }

    @Override
    public String description() {
        return "Сортировка по алфавиту";
    }
}
