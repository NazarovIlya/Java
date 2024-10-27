package Model;

public class UniversityModel{
    private String name;
    private float placeCountry;
    private int totalScore;
    private int estimateCountNobelGraduates;
    private int estimateCountNobelEmployees;
    private int rankCitationIndex;
    private int estimateCountArticlesNatureScience;
    private int estimateTotalCountArticles;
    private int weightedAssessment;
    private int[] scores;

    public UniversityModel() {
        this.scores = new int[]{0, 0};
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getPlaceCountry(){
        return this.placeCountry;
    }
    public void setPlaceCountry(float placeCountry) {
        this.placeCountry = placeCountry;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int x) {
        this.scores[0] = x;
    }

    public void setScores(int x, int y) {
        this.scores[0] = x;
        this.scores[1] = y;
    }

    @Override
    public String toString() {
        return String.format("%s\n%.2f\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%s",
                name, placeCountry, totalScore, estimateCountNobelGraduates, estimateCountNobelEmployees, rankCitationIndex,
                estimateCountArticlesNatureScience, estimateTotalCountArticles, weightedAssessment,
                (scores[1] > 0 ? String.format("%d-%d", scores[0], scores[1]) : scores[0]));
    }
}