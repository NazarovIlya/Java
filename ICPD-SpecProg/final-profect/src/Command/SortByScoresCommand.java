package Command;

import Logic.UniversityService;

public class SortByScoresCommand implements ICommand{
    private UniversityService service;

    public SortByScoresCommand(UniversityService service){
        this.service = service;
    }

    @Override
    public void execute() {
        this.service.sortByScores();
    }

    @Override
    public String description() {
        return "Сортировка по баллам или диапазонам баллов в национальном рейтинге";
    }
}
