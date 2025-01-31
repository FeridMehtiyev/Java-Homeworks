import java.util.ArrayList;

public class Room
{
    public Room(int number)
    {
        student_count=0;
        students=new Student[capacity];
    }

    public int number;
    private Student students[];
    private final int capacity=31;
    private int student_count;

    public boolean add_student(Student student)
    {
        if(student_count<capacity)
        {
            students[student_count]=student;
            student_count++;
            return true;
        }
        return false;
    }
    public boolean remove_student(String name)
    {
        int i;
        for(i=0;i<student_count;i++)
        {
            if(students[i].name.equals(name)) break;
        }
        if(i==student_count) return false;
        for(i=i+1;i<student_count;i++)
        {
            students[i-1]=students[i];
        }
        student_count--;
        return true;
    }
    public String[] get_names()
    {
        String[] names=new String[student_count];
        for(int i=0;i<student_count;i++) names[i]=students[i].name;
        return names;
    }
}
