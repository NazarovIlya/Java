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
        IView view = new ViewConsole();
        InputService inputService = new InputService(".\\resources\\", "data_univer.txt");
        ArrayList<UniversityModel> universityList = new ArrayList<UniversityModel>();
//        UniversityService service = new UniversityService(universityList);

//        UniversityModel a = new UniversityModel();
//        UniversityModel b = new UniversityModel();
//
//        a.setName("BBB");
//        a.setScores(120, 160);
//        b.setName("AAA");
//
//        universityList.add(a);
//        universityList.add(b);
//
//
//        System.out.println(universityList);
////      САМАЯ ПЕРВАЯ СОРТИРОВКА - нужна в любом случае для того, чтобы не вызывать методы лишний раз
//        service.sortByNameAZ();
//        System.out.println(universityList);
        ArrayList<UniversityModel> universityModels = inputService.ReadFromTXT();
        System.out.println(universityModels);

        int i = 0;
        while (true) {

            UniversityService service = new UniversityService(universityModels);

            //  САМАЯ ПЕРВАЯ СОРТИРОВКА - нужна в любом случае для того, чтобы не вызывать методы лишний раз
            service.sortByNameAZ();

            view.menu(commands);

            System.out.println(universityModels);
            i++;
            break;
        }
        System.out.println("ОТРАБОТАЛ...");
    }
}
