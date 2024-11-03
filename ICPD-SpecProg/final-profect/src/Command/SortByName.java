package Command;

import Logic.UniversityService;

public class SortByName implements ICommand{
    private UniversityService service;

    public SortByName(UniversityService service){
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
