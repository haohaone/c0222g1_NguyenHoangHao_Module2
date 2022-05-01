package test_codegym.utils;

import test_codegym.model.Subject;

import java.util.Comparator;

public class SubjectComparator implements Comparator<Subject> {
    @Override
    public int compare(Subject o1, Subject o2) {
        return Integer.compare(o1.getTime(), o2.getTime());
    }
}
