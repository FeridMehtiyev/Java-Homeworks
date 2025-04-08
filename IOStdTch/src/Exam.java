public class Exam {
    public String examname;
    public Subject subject;
    private Student[] students;
    private Teacher[] invigilators;

    public Exam(String examname, Subject subject, Teacher[] invigilators, Course course) {
        this.examname = examname;
        this.students = course.getStudents();
        this.invigilators = invigilators;
        this.subject = subject;
    }
    public Exam(String examname, Course course, Subject subject) {
        this.examname = examname;
        this.students = course.getStudents();
        this.invigilators = course.getTeachers();
        this.subject = subject;
    }
    public void conduct()
    {
        for(Student student : students)
        {
            student.asses(subject);
        }
    }
}
