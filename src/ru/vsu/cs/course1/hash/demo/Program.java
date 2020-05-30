package ru.vsu.cs.course1.hash.demo;

import ru.vsu.cs.course1.hash.SimpleHashMap;
import ru.vsu.cs.course1.hash.Solution;
import ru.vsu.cs.course1.hash.StudentMarks;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Program {

    /**
     * Основная функция программы
     *
     * @param args Параметры командной строки
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Map<String, StudentMarks> marksOfStudent = Solution.Read("Книга1.csv");
        Map<StudentMarks, List<String>> result = Solution.Solution(marksOfStudent);
        for(Iterator iter = result.entrySet().iterator();iter.hasNext();){
            Map.Entry<StudentMarks,List<String>> set = (Map.Entry<StudentMarks, List<String>>) iter.next();
                for(Iterator iter2 = set.getKey().getMarks().entrySet().iterator();iter2.hasNext();){
                    Map.Entry<String,String> marksSet = (Map.Entry<String, String>) iter2.next();
                    System.out.println(marksSet.getKey()+" " + marksSet.getValue());
                }
                for(String name:set.getValue()){
                    System.out.print(name+" ");
                }
                System.out.println();

        }
    }
}
