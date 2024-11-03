package Model;

public class UniversityModel{
    private String name;
    private int placeCountry;
    private float totalScore;
    private float estimateCountNobelGraduates;
    private float estimateCountNobelEmployees;
    private float rankCitationIndex;
    private float estimateCountArticlesNatureScience;
    private float estimateTotalCountArticles;
    private float weightedAssessment;
    private int[] scores;

    public UniversityModel() {
        this.scores = new int[]{0, 0};
    }

    public UniversityModel(String name, int placeCountry, float totalScore, float estimateCountNobelGraduates,
                           float estimateCountNobelEmployees, float rankCitationIndex, float estimateCountArticlesNatureScience,
                           float estimateTotalCountArticles, float weightedAssessment, int[] scores)
    {
        this.name = name;
        this.placeCountry = placeCountry;
        this.totalScore = totalScore;
        this.estimateCountNobelGraduates = estimateCountNobelGraduates;
        this.estimateCountNobelEmployees = estimateCountNobelEmployees;
        this.rankCitationIndex = rankCitationIndex;
        this.estimateCountArticlesNatureScience = estimateCountArticlesNatureScience;
        this.estimateTotalCountArticles = estimateTotalCountArticles;
        this.weightedAssessment = weightedAssessment;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPlaceCountry(){
        return this.placeCountry;
    }
    public void setPlaceCountry(int placeCountry) {
        this.placeCountry = placeCountry;
    }

    public float getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(float totalScore) {
        this.totalScore = totalScore;
    }

    public float getEstimateCountNobelGraduates() {
        return estimateCountNobelGraduates;
    }

    public void setEstimateCountNobelGraduates(float estimateCountNobelGraduates) {
        this.estimateCountNobelGraduates = estimateCountNobelGraduates;
    }

    public float getEstimateCountNobelEmployees() {
        return estimateCountNobelEmployees;
    }

    public void setEstimateCountNobelEmployees(float estimateCountNobelEmployees) {
        this.estimateCountNobelEmployees = estimateCountNobelEmployees;
    }

    public float getRankCitationIndex() {
        return rankCitationIndex;
    }

    public void setRankCitationIndex(float rankCitationIndex) {
        this.rankCitationIndex = rankCitationIndex;
    }

    public float getEstimateCountArticlesNatureScience() {
        return estimateCountArticlesNatureScience;
    }

    public void setEstimateCountArticlesNatureScience(float estimateCountArticlesNatureScience) {
        this.estimateCountArticlesNatureScience = estimateCountArticlesNatureScience;
    }

    public float getEstimateTotalCountArticles() {
        return estimateTotalCountArticles;
    }

    public void setEstimateTotalCountArticles(float estimateTotalCountArticles) {
        this.estimateTotalCountArticles = estimateTotalCountArticles;
    }

    public float getWeightedAssessment() {
        return weightedAssessment;
    }

    public void setWeightedAssessment(float weightedAssessment) {
        this.weightedAssessment = weightedAssessment;
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
        return String.format("%s\n%d\n%.1f\n%.1f\n%.1f\n%.1f\n%.1f\n%.1f\n%.1f\n%s\n",
                name, placeCountry, totalScore, estimateCountNobelGraduates, estimateCountNobelEmployees, rankCitationIndex,
                estimateCountArticlesNatureScience, estimateTotalCountArticles, weightedAssessment,
                (scores[1] > 0 ? String.format("%d-%d", scores[0], scores[1]) : String.format("%d", scores[0])));
    }
}