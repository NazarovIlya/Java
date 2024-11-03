package Comparators;

import Model.UniversityModel;

import java.util.Comparator;

public class ComparatorByScores<T extends UniversityModel> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getScores()[0], o2.getScores()[0]);
    }
}