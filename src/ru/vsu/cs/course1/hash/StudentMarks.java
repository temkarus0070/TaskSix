package ru.vsu.cs.course1.hash;

import ru.vsu.cs.util.dummy.DefaultNotSupportedMap;

import java.util.HashMap;
import java.util.Map;

public class StudentMarks implements  Comparable<StudentMarks>{
    private Map<String,String> marks = new HashMap<>();
    public void addMarks(String itemName,String mark){
        this.marks.put(itemName, mark);
    }
    public Map<String,String> getMarks(){
        return this.marks;
    }

    @Override
    public int compareTo(StudentMarks o) {
        if(hashCode() == o.hashCode())
            return 0;
        else if(hashCode() > o.hashCode())
            return 1;
        else
            return -1;
    }

    @Override
    public boolean equals(Object obj){
        int count = marks.size();
        int findCount = 0;
        StudentMarks differenceMarks = (StudentMarks) obj;
        for(Map.Entry<String,String> entry: marks.entrySet())
        {
            String itemName = entry.getKey();
            String thisMark = entry.getValue();
            String differenceMark = differenceMarks.marks.get(itemName);
            if(differenceMark.equals(thisMark))
                findCount++;
        }
        return findCount == count;

    }

    @Override
    public int hashCode(){
        int hashSum = 0;
        for(Map.Entry<String,String> entry: marks.entrySet())
        {
            String itemName = entry.getKey();
            String thisMark = entry.getValue();
            hashSum += itemName.hashCode();
            hashSum += thisMark.hashCode();
        }
        return hashSum;
    }


}
