package Logic;

import Model.UniversityModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputService implements IReadable{
    private ArrayList<UniversityModel> universityModels;
    private String filePath;
    private String fileName;
    private Scanner scanner;
    private int index;

    public InputService(String filePath, String fileName) {
        this.universityModels = new ArrayList<>();
        this.filePath = filePath;
        this.fileName = fileName;
        try {
            this.scanner = new Scanner(new File(String.format("%s%s", filePath, fileName)));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);

        }
        this.index = 0;
    }

    @Override
    public void ReadFromTXT() {
        UniversityModel university = new UniversityModel();
        String str = "";
        while (scanner.hasNext()){
            if(scanner.hasNextLine()){
                int[] arr = new int[]{0, 0};
                str = scanner.nextLine();
                String[] arrStr = new String[]{"", ""};
                if(str.contains("-")){
                    int first = (int)arr[0];
                    int second = (int)arr[1];
                    System.out.println(String.format("%d --> %d-%d", ++index, first, second));
                } else {
                    university.setName(str);
                }
                System.out.println(str);
                System.out.println(String.format("%d --> %s", ++index , str));
            } else if (scanner.hasNextInt()) {
                int num = scanner.nextInt();

                System.out.println(String.format("%d --> %d", ++index, num));
            } else if (scanner.hasNextFloat()) {
                float num = scanner.nextFloat();
                System.out.println(String.format("%d --> %f", ++index, num));
            }
            universityModels.add(university);
        }
    }
}
