package Model;

public class UniversityModel{
    private String name;
    private int placeCountry;
    private int totalScore;
    private int estimateCountNobelGraduates;
    private int estimateCountNobelEmployees;
    private int rankCitationIndex;
    private int estimateCountArticlesNatureScience;
    private int estimateTotalCountArticles;
    private int weightedAssessment;
    private int[] scores;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public UniversityModel() {
        this.scores = new int[]{0, 0};
    }

    public void setScores(int x, int y) {
        this.scores[0] = x;
        this.scores[1] = y;
    }

    public void setScores(int x) {
        this.scores[0] = x;
    }

    @Override
    public String toString() {
        return String.format("%s\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%s",
                name, placeCountry, totalScore, estimateCountNobelGraduates, estimateCountNobelEmployees, rankCitationIndex,
                estimateCountArticlesNatureScience, estimateTotalCountArticles, weightedAssessment,
                (scores[1] > 0 ? String.format("%d-%d", scores[0], scores[1]) : scores[0]));
    }
}