package ru.vsu.cs;

import ru.vsu.cs.course1.hash.StudentMarks;

import java.util.Map;

public class myComparator implements java.util.Comparator <Map.Entry<String, StudentMarks>>{

    @Override
    public int compare(Map.Entry<String, StudentMarks> o1, Map.Entry<String, StudentMarks> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}