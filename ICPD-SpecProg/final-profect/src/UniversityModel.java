public class UniversityModel {
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

    public UniversityModel() {
        this.scores = new int[2];
    }
}
