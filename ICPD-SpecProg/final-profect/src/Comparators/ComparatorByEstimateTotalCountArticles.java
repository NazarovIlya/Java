package Comparators;

import Model.UniversityModel;

import java.util.Comparator;

public class ComparatorByEstimateTotalCountArticles<T extends UniversityModel> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Float.compare(o2.getEstimateTotalCountArticles(), o1.getEstimateTotalCountArticles());
    }
}
