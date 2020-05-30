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

        List<Map.Entry<String,StudentMarks>> list = new ArrayList<>();
        for(Iterator iter = marks.entrySet().iterator();iter.hasNext();){
            Map.Entry<String,StudentMarks> mapEntry = (Map.Entry<String, StudentMarks>) iter.next();
            list.add(mapEntry);
        }
        list.sort(new myComparator());


        for(int i=0 ;i<list.size();i++){
            StudentMarks studentMarks = list.get(i).getValue();
            if(resultMap.get(studentMarks) == null)
                resultMap.put(studentMarks,new ArrayList<String>());

            ArrayList<String> nameList = (ArrayList<String>) resultMap.get(studentMarks);
            nameList.add(list.get(i).getKey());
        }

        return resultMap;





    }


    public static SimpleHashMap<StudentMarks,List<String>> mySolution(SimpleHashMap<String,StudentMarks> marks){
        SimpleHashMap resultMap = new SimpleHashMap<StudentMarks,List<String>>(300);

        List<SimpleHashMap.Entry<String,StudentMarks>> list = new ArrayList<>();
        for(Iterator iter = marks.entrySet().iterator();iter.hasNext();){
            SimpleHashMap.Entry<String,StudentMarks> mapEntry = (SimpleHashMap.Entry<String, StudentMarks>) iter.next();
            list.add(mapEntry);
        }
        list.sort(new myComparator());


        for(int i=0 ;i<list.size();i++){
            StudentMarks studentMarks = list.get(i).getValue();
            if(resultMap.get(studentMarks) == null)
                resultMap.put(studentMarks,new ArrayList<String>());

            ArrayList<String> nameList = (ArrayList<String>) resultMap.get(studentMarks);
            nameList.add(list.get(i).getKey());
        }

        return resultMap;





    }



}
