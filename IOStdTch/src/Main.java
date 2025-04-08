import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.transform.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static Student[] loadStudents(){
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            Student[] students = mapper.readValue(new File("students.json"), Student[].class);
            return students;
        }
        catch (IOException e) {
            if (e.getClass() == FileNotFoundException.class)
            {
                mapper = new ObjectMapper();
                Student[] students = new Student[10];
                students[0] = new Student("Alice", "Brown", 20, false);
                students[2] = new Student("Bob", "Green", 22, true);
                students[3] = new Student("Charlie", "Davis", 21, true);
                students[4] = new Student("Dana", "White", 23, false);
                students[5] = new Student("Eve", "Wilson", 24, false);
                students[6] = new Student("Frank", "Moore", 25, true);
                students[7] = new Student("Grace", "Taylor", 22, false);
                students[8] = new Student("Henry", "Anderson", 23, true);
                students[9] = new Student("Ivy", "Thomas", 21, false);
                students[1] = new Student("Jack", "Jackson", 24, true);
                try
                {
                    mapper.writeValue(new File("students.json"),students);
                }
                catch (IOException e1)
                {
                    System.out.println("Error writing to file");
                }
                return loadStudents();
            }
        }
        return null;
    }
    public static Teacher[] loadTeachers(){
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            Teacher[] teachers = mapper.readValue(new File("teachers.json"),Teacher[].class);
            return teachers;
        }
        catch (IOException e) {
            if (e.getClass() == FileNotFoundException.class)
            {
                mapper = new ObjectMapper();
                Teacher[] teachers = new Teacher[5];
                teachers[0] = new Teacher("John", "Doe", 35, true,Subject.Math);
                teachers[1] = new Teacher("Jane", "Smith", 40, false,Subject.English);
                teachers[2] = new Teacher("Emily", "Johnson", 45, false,Subject.Biology);
                teachers[3] = new Teacher("Michael", "Brown", 50, true,Subject.ComputerScience);
                teachers[4] = new Teacher("Lily", "Miller", 38, false,Subject.Math);
                try
                {
                    mapper.writeValue(new File("teachers.json"),teachers);
                }
                catch (IOException e1)
                {
                    System.out.println("Error writing to file");
                }
                return loadTeachers();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Student[] students = loadStudents();
        Teacher[] teachers = loadTeachers();
    }
}