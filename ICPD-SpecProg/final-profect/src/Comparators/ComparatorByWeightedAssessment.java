package Comparators;

import Model.UniversityModel;

import java.util.Comparator;

public class ComparatorByWeightedAssessment<T extends UniversityModel> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Float.compare(o2.getWeightedAssessment(), o1.getWeightedAssessment());
    }
}
