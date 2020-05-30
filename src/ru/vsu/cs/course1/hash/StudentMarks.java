package ru.vsu.cs.course1.hash;

import ru.vsu.cs.util.dummy.DefaultNotSupportedMap;

import java.util.HashMap;
import java.util.Map;

public class StudentMarks implements  Comparable<StudentMarks>{
    private Map<String,String> marks = new HashMap<>();
    private int hash = 0;
    public void addMarks(String itemName,String mark){
        this.marks.put(itemName, mark);
    }

    public int getHash(){
        return this.hash;
    }

    @Override
    public int compareTo(StudentMarks o) {
        int thisHashSum = 0;
        int hashSum = 0;
       // double multiple = 0.01;
        int count = 0;
        for(Map.Entry<String,String> entry: marks.entrySet())
        {
            String itemName = entry.getKey();
            String thisMark = entry.getValue();
            thisHashSum += thisMark.hashCode();
            String mark = o.marks.get(itemName);
            hashSum += mark.hashCode();
      //      multiple += 0.01;

        }
        this.hash = thisHashSum;
        o.hash = hashSum;
        if(thisHashSum == hashSum){
            return 0;
        }
        else if(thisHashSum> hashSum)
        return 1;
        else return -1;
    }

    @Override
    public int hashCode(){
        return hash;
    }
}
