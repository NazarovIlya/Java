import Command.*;
import Logic.InputService;
import Logic.UniversityService;
import View.IView;
import View.QuiteCommand;
import View.ViewConsole;
import Model.UniversityModel;
import java.util.ArrayList;
import java.util.Arrays;


public class Presenter {

    public void start(){

        InputService inputService = new InputService(".\\resources\\", "data_univer.txt");
        ArrayList<UniversityModel> universityList = new ArrayList<UniversityModel>();
        // Чтение из файла с охранением с в списке
        ArrayList<UniversityModel> universityModels = inputService.ReadFromTXT();
        UniversityService service = new UniversityService(universityModels);

        ICommand[] commandList = new ICommand[]
                {
                        new QuiteCommand(service),
                        new SortByNameCommand(service),
                        new SortByPlaceInCountryCommand(service),
                        new SortByTotalScoreCommand(service),
                        new SortByEstimateCountNobelGraduatesCommand(service),
                        new SortByEstimateCountNobelEmployeesCommand(service),
                        new SortByRankCitationIndexCommand(service),
                        new SortByEstimateCountArticlesNatureScienceCommand(service),
                        new SortByEstimateTotalCountArticlesCommand(service),
                        new SortByWeightedAssessmentCommand(service),
                        new SortByScoresCommand(service)
                };
        ArrayList<ICommand> commands = new ArrayList<>(Arrays.asList(commandList));
        IView view = new ViewConsole(commands);


        while (service.getRunStatus()) {

            //  САМАЯ ПЕРВАЯ СОРТИРОВКА - алфавиту (нужна в любом случае для того, чтобы не вызывать методы лишний раз)
            service.sortByNameAZ();
            // МЕНЮ
            int index = view.menu();
            commands.get(index).execute();

            if(index != 0) {
                // Печать списка университетов
                universityModels.stream().forEach(System.out::println);
            }
        }
    }
}
