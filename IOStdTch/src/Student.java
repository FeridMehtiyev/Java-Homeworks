import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
public class Student extends Human implements Learnable {
    private float[][] grades;
    private int[] knowledge;

    public Student() {}

    public Student(String name, String surname, int age, boolean gender)
    {
        super(name, surname, age, gender);
        grades = new float[Subject.values().length][0];
        knowledge = new int[Subject.values().length];
    }

    public float[][] getGrades() {return grades;}
    public int[] getKnowledge() {return knowledge;}

    public boolean asses(Subject subject) {
        int index = subject.ordinal();
        grades[index]=Arrays.copyOf(grades[index], grades[index].length+1);
        grades[index][grades.length-1]=knowledge[index];
        return true;
    }

    @Override
    public void learn(Subject subject) {
        int understanding = new Random().nextInt(100);
        int num = 0;
        for (num = 0; num < Subject.values().length; num++) {
            if (subject == Subject.values()[num]) {
                knowledge[num] = understanding;
                return;
            }
        }
    }
    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj) && Arrays.equals(grades, ((Student)obj).grades) && Arrays.equals(knowledge, ((Student)obj).knowledge);
    }
}
