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
                continue;
            }

            try {
                    line = scanner.nextLine();
                    university.setPlaceCountry(Integer.parseInt(line));
            } catch(Exception e){
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setTotalScore(Float.parseFloat(line));
            } catch (Exception e){
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setEstimateCountNobelGraduates(Float.parseFloat(line));
            } catch (Exception e){
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setEstimateCountNobelEmployees(Float.parseFloat(line));
            } catch (Exception e){
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setRankCitationIndex(Float.parseFloat(line));
            } catch (Exception e){
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setEstimateCountArticlesNatureScience(Float.parseFloat(line));
            } catch (Exception e){
                continue;
            }

            try {
                line = scanner.nextLine();
                university.setEstimateTotalCountArticles(Float.parseFloat(line));
            } catch (Exception e){
                continue;
            }

            try{
                line = scanner.nextLine();
                university.setWeightedAssessment(Float.parseFloat(line));
            } catch(Exception e) {
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
                continue;
            }
            universityModels.add(university);
        }
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
