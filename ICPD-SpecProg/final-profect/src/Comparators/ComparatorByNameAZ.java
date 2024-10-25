package Comparators;

import Model.UniversityModel;

import java.util.Comparator;

public class ComparatorByNameAZ<T extends UniversityModel> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return  o1.getName().compareTo(o2.getName());
    }
}