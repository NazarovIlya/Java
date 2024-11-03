import Command.ICommand;
import Logic.InputService;
import Logic.UniversityService;
import View.IView;
import View.QuiteCommand;
import View.ViewConsole;
import Model.UniversityModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Presenter {

    public void start(){

        InputService inputService = new InputService(".\\resources\\", "data_univer.txt");
        ArrayList<UniversityModel> universityList = new ArrayList<UniversityModel>();
        // Чтение из файла с охранением с в списке
        ArrayList<UniversityModel> universityModels = inputService.ReadFromTXT();
        UniversityService service = new UniversityService(universityModels);

        ICommand[] commandList = new ICommand[]
                {
                        new QuiteCommand(service)
                };
        ArrayList<ICommand> commands = new ArrayList<>(Arrays.asList(commandList));
        IView view = new ViewConsole(commands);

//        System.out.println(universityModels);

        int i = 0;
        while (service.getRunStatus()) {

            //  САМАЯ ПЕРВАЯ СОРТИРОВКА - нужна в любом случае для того, чтобы не вызывать методы лишний раз
            service.sortByNameAZ();
            service.sortByScores();
            // Печать списка университетов
            universityModels.stream().forEach(System.out::println);

            int index = view.menu();
            commands.get(index).execute();
//            System.out.println(String.format("! ! ! --> %d", index));
            i++;
            break;
        }
        System.out.println("ОТРАБОТАЛ...");
    }
}
