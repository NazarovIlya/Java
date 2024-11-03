package Command;

import Logic.UniversityService;

public class SortByEstimateCountNobelGraduatesCommand implements ICommand{
    private UniversityService service;

    public SortByEstimateCountNobelGraduatesCommand(UniversityService service){
        this.service = service;
    }
    @Override
    public void execute() {
        service.sortByEstimateCountNobelGraduates();
    }

    @Override
    public String description() {
        return "Сортировка по оценке выпускников, основанной на количестве выпускников учебного заведения получивших премии";
    }
}
