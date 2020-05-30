package ru.vsu.cs.course1.hash.demo;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Callback;
import ru.vsu.cs.course1.hash.SimpleHashMap;
import ru.vsu.cs.course1.hash.Solution;
import ru.vsu.cs.course1.hash.StudentMarks;

import java.util.*;


public class Program extends Application {

    public static Stage primaryStage;

    /**
     *
     * Основная функция программы
     *
     * @param args Параметры командной строки
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Application.launch(args);
       /* SimpleHashMap myMarksOfStudent = Solution.myRead("Книга1.csv");
        SimpleHashMap<StudentMarks, List<String>> myResult = Solution.mySolution( myMarksOfStudent);
        Map<String, StudentMarks> marksOfStudent = Solution.read("Книга1.csv");
        Map<StudentMarks, List<String>> result = Solution.solution(marksOfStudent);
        for(Iterator iter = result.entrySet().iterator();iter.hasNext();){
            Map.Entry<StudentMarks,List<String>> set = (Map.Entry<StudentMarks, List<String>>) iter.next();
                for(Iterator iter2 = set.getKey().getMarks().entrySet().iterator();iter2.hasNext();){
                    Map.Entry<String,String> marksSet = (Map.Entry<String, String>) iter2.next();
                    System.out.println(marksSet.getKey()+" " + marksSet.getValue());
                }
                for(String name:set.getValue()){
                    System.out.print(name+"  ");
                }
                System.out.println();
            System.out.println();

        }

        System.out.println("а вот \"мой\" словарь");
        System.out.println();

        for(Iterator iter = myResult.entrySet().iterator();iter.hasNext();){
            HashMap.Entry<StudentMarks,List<String>> set = (HashMap.Entry<StudentMarks, List<String>>) iter.next();
            for(Iterator iter2 = set.getKey().getMarks().entrySet().iterator();iter2.hasNext();){
                HashMap.Entry<String,String> marksSet = (HashMap.Entry<String, String>) iter2.next();
                System.out.println(marksSet.getKey()+" " + marksSet.getValue());
            }
            for(String name:set.getValue()){
                System.out.print(name+"  ");
            }
            System.out.println();

        }*/


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Program.primaryStage = primaryStage;
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Task six");
        double width = Screen.getPrimary().getBounds().getWidth();
        double height = Screen.getPrimary().getBounds().getHeight();
        primaryStage.setWidth(width);
        primaryStage.setHeight(height);
        primaryStage.show();
    }
}
