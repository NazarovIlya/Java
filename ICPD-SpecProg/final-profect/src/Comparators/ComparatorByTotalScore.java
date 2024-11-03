package Comparators;

import Model.UniversityModel;

import java.util.Comparator;

public class ComparatorByTotalScore<T extends UniversityModel> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Float.compare(o2.getTotalScore(), o1.getTotalScore());
    }
}
