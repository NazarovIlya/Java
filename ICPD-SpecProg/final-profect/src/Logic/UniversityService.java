package Logic;

import Comparators.*;
import Model.UniversityModel;
import java.util.ArrayList;
import java.util.Collections;

public class UniversityService<T extends UniversityModel>{
    private ArrayList<T> list;

    public UniversityService(ArrayList<T> list) {
        this.list = list;
    }

    public void sortByNameAZ(){
        Collections.sort(this.list, new ComparatorByNameAZ());
    }

    public void sortByNameZA(){
        Collections.sort(this.list, new ComparatorsByNameZA<>());
    }

    public void sortByPlaceInCountry() { Collections.sort(this.list, new ComparatorByPlaceInCountry<>()); }

    public void sortByTotalScore() { Collections.sort(this.list, new ComparatorByTotalScore<>()); }

    public void sortByEstimateCountNobelGraduates() { Collections.sort(this.list, new ComparatorByEstimateCountNobelGraduates<>()); }

    public void sortByEstimateCountNobelEmployees() { Collections.sort(this.list, new ComparatorByEstimateCountNobelEmployees<>()); }

    public void sortByRankCitationIndex() { Collections.sort(this.list, new ComparatorByRankCitationIndex<>()); }

    public void sortByEstimateCountArticlesNatureScience() { Collections.sort(this.list, new ComparatorByEstimateCountArticlesNatureScience<>()); }

    public void sortByEstimateTotalCountArticles() { Collections.sort(this.list, new ComparatorByEstimateTotalCountArticles<>()); }

    public void sortByWeightedAssessment() { Collections.sort(this.list, new ComparatorByWeightedAssessment<>()); }

    public void sortByScores() { Collections.sort(this.list, new ComparatorByScores<>()); }

}
