import java.util.Arrays;

public class Course {
    private String coursename;
    private Subject[] subjects;
    private int courselength;
    private Teacher[] teachers;
    private Student[] students;

    public String getCoursename() {return coursename;}
    public Subject[] getSubjects() {return subjects;}
    public int getCourselength() {return courselength;}
    public Teacher[] getTeachers() {return teachers;}
    public Student[] getStudents() {return students;}

    public Course(String coursename)
    {
        this.coursename = coursename;
        this.subjects = new Subject[0];
        this.courselength = 0;
        this.teachers = new Teacher[0];
        this.students = new Student[0];
    }
    public Course(String coursename, Subject[] subjects, Teacher[] teachers)
    {
        this.coursename = coursename;
        this.subjects = subjects;
        this.courselength = subjects.length*30;
        this.teachers = teachers;
        this.students = new Student[0];
    }

    public boolean addStudent(Student student)
    {
        students = Arrays.copyOf(students, students.length+1);
        students[students.length-1] = student;
        return true;
    }
    public boolean removeStudent(Student student)
    {
        Student[] temp = new Student[students.length-1];
        for(int i=0,j=0; i<students.length; i++)
        {
            if(j==students.length-1) return false;
            if(!students[i].equals(student))
            {
                temp[j++] = students[i];
            }
        }
        students = temp;
        return true;
    }

    public boolean addTeacher(Teacher teacher)
    {
        teachers = Arrays.copyOf(teachers, teachers.length+1);
        teachers[teachers.length-1] = teacher;
        boolean flag = false;
        for(Subject s : subjects)
        {
            if(s==teacher.subject) flag = true;
        }
        if(!flag)
        {
            subjects = Arrays.copyOf(subjects, subjects.length+1);
            subjects[subjects.length-1] = teacher.subject;
            courselength+=30;
        }
        return true;
    }
    public boolean removeTeacher(Teacher teacher) {
        Teacher[] temp = new Teacher[teachers.length - 1];
        boolean Subjectflag = false;
        for (int i = 0, j = 0; i < teachers.length; i++) {
            if (j == teachers.length - 1) return false;
            if (!teachers[i].equals(teacher)) {
                if (teachers[i].subject == teacher.subject) Subjectflag = true;
                temp[j++] = teachers[i];
            }
        }
        if (!Subjectflag)
        {
            Subject[] temp1 = new Subject[subjects.length-1];
            for(int i=0,j=0; i<subjects.length; i++)
            {
                if(teacher.subject!=subjects[i])
                {
                    temp1[j++] = subjects[i];
                }
            }
            subjects = temp1;
        }
        teachers = temp;
        return true;

    }

    @Override
    public String toString()
    {
        String subjectnames = "";
        for(int i=0;i< subjects.length;i++)
        {
            subjectnames +=  subjects[i].toString() + ", ";
        }
        return "This is " + coursename +", we teach " + subjectnames + "in our " + Integer.toString(courselength) + " course. Our great teachers are in here: " + Arrays.toString(teachers);
    }
}
