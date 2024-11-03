package Command;

import Logic.UniversityService;

public class SortByTotalScoreCommand implements ICommand{
    private UniversityService service;

    public SortByTotalScoreCommand(UniversityService service){
        this.service = service;
    }

    @Override
    public void execute() {
        service.sortByTotalScore();
    }

    @Override
    public String description() {
        return "Сортировка по общему баллу, используемому для определения рейтинга";
    }
}
