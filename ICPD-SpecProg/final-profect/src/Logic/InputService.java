package Logic;

import Model.UniversityModel;

import javax.swing.plaf.PanelUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputService implements IReadable{
    private ArrayList<UniversityModel> universityModels;
    private String filePath;
    private String fileName;
    private Scanner scanner;
    private boolean isReadError;

    public InputService(String filePath, String fileName) {
        this.universityModels = new ArrayList<>();
        this.filePath = filePath;
        this.fileName = fileName;
        this.isReadError = false;
        try {
            this.scanner = new Scanner(new File(String.format("%s%s", filePath, fileName)));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<UniversityModel> ReadFromTXT() {
        int i = 0;
        while (scanner.hasNext()) {
            UniversityModel university = new UniversityModel();
            int first = 0;
            int second = 0;
            String line = "";

            try {
                line = scanner.nextLine();
                if(isString(line)) {
                    university.setName(line);
                } else continue;
            } catch (Exception e){
                this.isReadError = true;
                continue;
            }

            try {
                    line = scanner.nextLine();
                    university.setPlaceCountry(Integer.parseInt(line));
            } catch(Exception e){
                this.isReadError = true;
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setTotalScore(Float.parseFloat(line));
            } catch (Exception e){
                this.isReadError = true;
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setEstimateCountNobelGraduates(Float.parseFloat(line));
            } catch (Exception e){
                this.isReadError = true;
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setEstimateCountNobelEmployees(Float.parseFloat(line));
            } catch (Exception e){
                this.isReadError = true;
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setRankCitationIndex(Float.parseFloat(line));
            } catch (Exception e){
                this.isReadError = true;
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setEstimateCountArticlesNatureScience(Float.parseFloat(line));
            } catch (Exception e){
                this.isReadError = true;
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setEstimateTotalCountArticles(Float.parseFloat(line));
            } catch (Exception e){
                this.isReadError = true;
                continue;
            }

            try{
                line = scanner.nextLine();
                university.setWeightedAssessment(Float.parseFloat(line));
            } catch(Exception e) {
                this.isReadError = true;
                continue;
            }

            try {
                line = scanner.nextLine();
                if (line.contains("-") && !isString(line)) {
                    String[] arrStr = line.split("-");
                    first = Integer.parseInt(arrStr[0]);
                    second = Integer.parseInt(arrStr[1]);
                    university.setScores(first, second);
                } else {
                    if (!isString(line)) {
                        university.setScores(Integer.parseInt(line));
                    }
                }
            } catch (Exception e){
                this.isReadError = true;
                continue;
            }
            universityModels.add(university);
        }
        if(!this.isReadError)
            System.out.println("Файл прочитан полностью\n");
        else
            System.out.println("Файл содержит ошибки, часть инфорамции прочитана и готова к дальнейшей обработке.\n");

        return  universityModels;
    }

    private boolean isString(String line){

        char[] c = line.toCharArray();
            if(!Character.isDigit(c[0])){
                return true;
            }
        return false;
    }
}
