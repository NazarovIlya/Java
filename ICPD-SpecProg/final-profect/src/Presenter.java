import Command.ICommand;
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

        ICommand[] commandList = new ICommand[]
                {
                        new QuiteCommand(),
                        new QuiteCommand(),
                        new QuiteCommand()
                };
        ArrayList<ICommand> commands = new ArrayList<>(Arrays.asList(commandList));
        IView view = new ViewConsole(commands);
        InputService inputService = new InputService(".\\resources\\", "data_univer.txt");
        ArrayList<UniversityModel> universityList = new ArrayList<UniversityModel>();
        // Чтение из файла с охранением с в списке
        ArrayList<UniversityModel> universityModels = inputService.ReadFromTXT();
//        System.out.println(universityModels);

        int i = 0;
        while (true) {

            UniversityService service = new UniversityService(universityModels);

            //  САМАЯ ПЕРВАЯ СОРТИРОВКА - нужна в любом случае для того, чтобы не вызывать методы лишний раз
//            service.sortByNameAZ();
            service.sortByEstimateCountNobelGraduates();
            // Печать списка университетов
            System.out.println(universityModels);

            int index = view.menu();
            commands.get(index).execute();
//            System.out.println(String.format("! ! ! --> %d", index));
            i++;
            break;
        }
        System.out.println("ОТРАБОТАЛ...");
    }
}
