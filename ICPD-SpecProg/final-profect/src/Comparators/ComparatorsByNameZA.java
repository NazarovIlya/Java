package Comparators;

import Model.UniversityModel;

import java.util.Comparator;

public class ComparatorsByNameZA<T extends UniversityModel> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o2.getName().compareTo(o1.getName());
    }
}