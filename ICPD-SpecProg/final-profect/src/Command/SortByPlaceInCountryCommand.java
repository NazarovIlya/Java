package Command;

import Logic.UniversityService;

public class SortByPlaceInCountryCommand implements ICommand{
    private UniversityService service;

    public SortByPlaceInCountryCommand(UniversityService service){
        this.service = service;
    }
    @Override
    public void execute() {
        this.service.sortByPlaceInCountry();
    }

    @Override
    public String description() {
        return "Сортировка по месту университета в своей стране";
    }
}
