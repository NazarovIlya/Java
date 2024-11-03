package Command;

import Logic.UniversityService;

public class SortByEstimateCountNobelEmployeesCommand implements ICommand{
    private UniversityService service;

    public SortByEstimateCountNobelEmployeesCommand(UniversityService service){
        this.service = service;
    }
    @Override
    public void execute() {
        service.sortByEstimateCountNobelEmployees();
    }

    @Override
    public String description() {
        return "Сортировка по оценке сотрудников учреждения, основанной на количестве выпускников учебного заведения получивших премии";
    }
}
