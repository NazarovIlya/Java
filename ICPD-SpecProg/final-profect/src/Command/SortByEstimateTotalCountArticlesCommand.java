package Command;

import Logic.UniversityService;

public class SortByEstimateTotalCountArticlesCommand implements ICommand{
    private UniversityService service;

    public SortByEstimateTotalCountArticlesCommand(UniversityService service){
        this.service = service;
    }

    @Override
    public void execute() {
        service.sortByEstimateTotalCountArticles();
    }

    @Override
    public String description() {
        return "Сортировка по оценке, основанной на общем количестве статей";
    }
}
