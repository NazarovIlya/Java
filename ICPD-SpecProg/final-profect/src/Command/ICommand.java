package Command;

public interface ICommand {
    void execute() throws InterruptedException;
    String description();
}
