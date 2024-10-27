package Logic;

import java.util.Scanner;

public class InputService implements IReadable{
    private String filePath;
    private String fileName;

    public InputService(String filePath, String fileName) {
        this.filePath = filePath;
        this.fileName = fileName;
    }

    @Override
    public void ReadFromTXT() {
        Scanner scanner = new Scanner(String.format("%s%s", filePath, fileName));
        while (scanner.hasNext()){
            break;
        }
    }
}
