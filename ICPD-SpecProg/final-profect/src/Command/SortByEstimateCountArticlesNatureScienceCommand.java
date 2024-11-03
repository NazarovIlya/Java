package Command;

import Logic.UniversityService;

public class SortByEstimateCountArticlesNatureScienceCommand implements ICommand{
    private UniversityService service;

    public SortByEstimateCountArticlesNatureScienceCommand(UniversityService service){
        this.service = service;
    }
    @Override
    public void execute() {
        this.service.sortByEstimateCountArticlesNatureScience();
    }

    @Override
    public String description() {
        return "Сортировка по оценке, основанной на количестве статей, опубликованных в журнале Nature and Science";
    }
}
