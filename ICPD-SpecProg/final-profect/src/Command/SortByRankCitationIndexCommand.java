package Command;

import Logic.UniversityService;

public class SortByRankCitationIndexCommand implements ICommand{
    private UniversityService service;

    public SortByRankCitationIndexCommand(UniversityService service){
        this.service = service;
    }
    @Override
    public void execute() {
        service.sortByRankCitationIndex();
    }

    @Override
    public String description() {
        return "Сортировка по рейтингу, основаннаму на количестве высокоцитируемых исследователей";
    }
}
