package ru.vsu.cs.course1.hash;

import ru.vsu.cs.myComparator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Stream;
import java.util.Comparator;

public class Solution {

    public static  Map<String,StudentMarks> Read(String path) throws FileNotFoundException {
        Map<String,StudentMarks> data = new HashMap<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        Stream<String> fileStream = reader.lines();

        for (Iterator<String> it = fileStream.iterator(); it.hasNext(); ) {
            String str = it.next();
            String[] marksArray = str.split(";");
            String itemName = marksArray[0];
            String studentName = marksArray[1];
            String mark = marksArray[2];
            if(data.get(mark) == null)
                data.put(studentName,new StudentMarks());
            StudentMarks marks =  data.get(studentName);
            marks.addMarks(itemName,mark);
        }
        return data;
    }

    public static void Solution(Map<String,StudentMarks> marks){
        Map<StudentMarks,List<String>> resultMap = new HashMap<>();

        List<Map.Entry<String,StudentMarks>> list = new ArrayList<>();
        for(Iterator iter = marks.entrySet().iterator();iter.hasNext();){
            Map.Entry<String,StudentMarks> mapEntry = (Map.Entry<String, StudentMarks>) iter.next();
            list.add(mapEntry);
        }
        list.sort(new myComparator());


        for(int i=0 , hash = list.get(i).getValue().getHash();i<list.size();i++){
            if(resultMap.get(list.get(i).getValue()) == null)
                resultMap.put(list.get(i).getValue(),new ArrayList<String>());

            

            if(hash == list.get(i).getValue().getHash())
            {

            }
        }
        for(Map.Entry<String,StudentMarks> entry:list){

        }




    }

}
