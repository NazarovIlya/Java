package Logic;

import Comparators.ComparatorByEstimateCountNobelGraduates;
import Comparators.ComparatorByNameAZ;
import Comparators.ComparatorByPlaceInCountry;
import Comparators.ComparatorsByNameZA;
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

    public void sortByEstimateCountNobelGraduates() { Collections.sort(this.list, new ComparatorByEstimateCountNobelGraduates<>()); }
}
