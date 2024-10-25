import Command.ICommand;
import Comparators.ComparatorByNameAZ;
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

        ArrayList<UniversityModel> list = new ArrayList<UniversityModel>();

        UniversityModel a = new UniversityModel();
        UniversityModel b = new UniversityModel();

        a.setName("BBB");
        a.setScores(120, 160);
        b.setName("AAA");

        list.add(a);
        list.add(b);

        UniversityService service = new UniversityService(list);


        System.out.println(list);
//      САМАЯ ПЕРВАЯ СОРТИРОВКА - нужна в любом случае для того, чтобы не вызывать методы лишний раз
        service.sortByNameAZ();
        System.out.println(list);

        ICommand[] commandList = new ICommand[]
                {
                        new QuiteCommand(),
                        new QuiteCommand(),
                        new QuiteCommand()
                };

        IView view = new ViewConsole();
        ArrayList<ICommand> commands = new ArrayList<>(Arrays.asList(commandList));

        while (true) {
            view.menu(commands);
            break;
        }
    }
}
