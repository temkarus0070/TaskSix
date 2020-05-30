package ru.vsu.cs;

import ru.vsu.cs.course1.hash.StudentMarks;

import java.util.Map;

public class myComparator implements java.util.Comparator <Map.Entry<String, StudentMarks>>{

    @Override
    public int compare(Map.Entry<String, StudentMarks> o1, Map.Entry<String, StudentMarks> o2) {
        if(o1.getValue().compareTo(o2.getValue()) == 0)
            return 0;
        else if(o1.getValue().compareTo(o2.getValue()) == -1)
            return -1;
        else
            return 1;

    }
}