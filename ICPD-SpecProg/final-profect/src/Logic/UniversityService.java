package Logic;

import Comparators.ComparatorByNameAZ;
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
}
