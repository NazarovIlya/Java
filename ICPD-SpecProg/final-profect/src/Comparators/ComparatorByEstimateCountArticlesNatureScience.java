package Comparators;

import Model.UniversityModel;

import java.util.Comparator;

public class ComparatorByEstimateCountArticlesNatureScience<T extends UniversityModel> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Float.compare(o2.getEstimateCountArticlesNatureScience(), o1.getEstimateCountArticlesNatureScience());
    }
}
