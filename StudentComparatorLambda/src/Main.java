import java.util.*;

public class Main {
    public static void main(String[] args) {

        Comparator<Student> compare = (Student o1, Student o2)->{
            if(o1.grade<o2.grade) return 1;
            else if(o1.grade>o2.grade) return -1;
            else {
                if(o1.birthYear<o2.birthYear) return -1;
                else if(o1.birthYear>o2.birthYear) return 1;
                else {
                    if(o1.gender && !o2.gender) return 1;
                    else if(!o1.gender && o2.gender) return -1;
                    else {
                        if(o1.surname.compareTo(o2.surname) > 0) return 1;
                        else if(o1.surname.compareTo(o2.surname) < 0) return -1;
                        else {
                            if(o1.name.compareTo(o2.name) > 0) return -1;
                            else if(o1.name.compareTo(o2.name) < 0) return 1;
                            else
                            {
                                if(o1.id>o2.id) return 1;
                                else if(o1.id<o2.id) return -1;
                                else return 0;
                            }
                        }
                    }
                }
            }
        };

        // Creating a list of students
        Student[] students = new Student[5];

        // Adding some sample students
        students[0]=new Student(1, "Alice", "Smith", 85.5f, true, 2002);
        students[1]=new Student(2, "Bob", "Johnson", 92.3f, false, 2001);
        students[2]=new Student(3, "Charlie", "Brown", 85.5f, true, 2002);
        students[3]=new Student(4, "Diana", "Taylor", 88.0f, true, 2003);
        students[4]=new Student(5, "Ethan", "Anderson", 92.3f, true, 2001);
        Arrays.sort(students, compare);
        for(int i=0; i<students.length; i++) System.out.println(students[i].toString());
    }
}