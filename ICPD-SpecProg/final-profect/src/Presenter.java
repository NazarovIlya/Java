import Command.ICommand;
import View.IView;
import View.QuiteCommand;
import View.ViewConsole;

import java.util.ArrayList;
import java.util.Arrays;

public class Presenter {

    public void start(){
        UniversityModel universityModel = new UniversityModel();
        universityModel.setScores(120, 160);

        System.out.println(universityModel);

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
