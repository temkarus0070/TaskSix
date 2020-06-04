package ru.vsu.cs.course1.hash;

import ru.vsu.cs.myComparator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Stream;
import java.util.Comparator;

public class Solution {

    public static  Map<String,StudentMarks> read(String path) throws FileNotFoundException {
        Map<String,StudentMarks> data = new HashMap<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        Stream<String> fileStream = reader.lines();

        for (Iterator<String> it = fileStream.iterator(); it.hasNext(); ) {
            String str = it.next();
            String[] marksArray = str.split(";");
            if(marksArray.length == 3) {
                String itemName = marksArray[0];
                String studentName = marksArray[1];
                String mark = marksArray[2];
                if (data.get(studentName) == null)
                    data.put(studentName, new StudentMarks());
                StudentMarks marks = data.get(studentName);
                marks.addMarks(itemName, mark);
            }
        }
        return data;
    }

    public static  SimpleHashMap<String,StudentMarks> myRead(String path) throws FileNotFoundException {
        SimpleHashMap<String,StudentMarks> data = new SimpleHashMap<>(300);
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        Stream<String> fileStream = reader.lines();

        for (Iterator<String> it = fileStream.iterator(); it.hasNext(); ) {
            String str = it.next();
            String[] marksArray = str.split(";");
            if(marksArray.length == 3) {
                String itemName = marksArray[0];
                String studentName = marksArray[1];
                String mark = marksArray[2];
                if (data.get(studentName) == null)
                    data.put(studentName, new StudentMarks());
                StudentMarks marks = data.get(studentName);
                marks.addMarks(itemName, mark);
            }
        }
        return data;
    }

    public static Map<StudentMarks,List<String>> solution(Map<String,StudentMarks> marks){
        Map<StudentMarks,List<String>> resultMap = new HashMap<>();
        for(Iterator<Map.Entry<String, StudentMarks>> iter = marks.entrySet().iterator();iter.hasNext();){

            Map.Entry<String,StudentMarks> mapEntry = iter.next();
            List<String> list  = resultMap.get(mapEntry.getValue());
            if(list == null)
                resultMap.put(mapEntry.getValue(),new ArrayList<>());
            list  = resultMap.get(mapEntry.getValue());
            list.add(mapEntry.getKey());
        }

        return resultMap;





    }


    public static SimpleHashMap<StudentMarks,List<String>> mySolution(SimpleHashMap<String,StudentMarks> marks){
        SimpleHashMap<StudentMarks,List<String>> resultMap = new SimpleHashMap<>(300);
        for(Iterator<SimpleHashMap.Entry<String, StudentMarks>> iter = marks.entrySet().iterator();iter.hasNext();){
            SimpleHashMap.Entry<String,StudentMarks> mapEntry = iter.next();
            List<String> list  = resultMap.get(mapEntry.getValue());
            if(list == null)
                resultMap.put(mapEntry.getValue(),new ArrayList<>());
            list  = resultMap.get(mapEntry.getValue());
            list.add(mapEntry.getKey());
        }
        return resultMap;
    }



}
