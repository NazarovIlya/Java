package Command;

import sun.reflect.ReflectionFactory;

public interface ICommand {
    void execute();
    String description();
}
